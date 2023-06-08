package LAB12.service;

import LAB12.fields.Permission;
import LAB12.fields.Person;
import LAB12.fields.Role;
import LAB12.fields.User;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class UserService {

    public static List<User> findUsersWhoHaveMoreThanOneAddress(List<User> users) {
        return users.stream()
                .filter(User->User.getPersonDetails().getAddresses().size() > 1)
                .collect(Collectors.toList());
    }

    public static User findOldestPerson(List<User> users) {
        int maxAge = users.stream()
                .map(User::getPersonDetails)
                .max(Comparator.comparingInt(Person::getAge))
                .get()
                .getAge();
        return users.stream()
                .filter(User->User.getPersonDetails().getAge() == maxAge)
                .findFirst()
                .get();
    }

    public static User findUserWithLongestUsername(List<User> users) {
        return users.stream().max(Comparator.comparingInt(user -> user.getName().length())).get();
    }

    public static String getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(List<User> users) {
        return users.stream()
                .filter(user -> user.getPersonDetails().getAge() > 18)
                .map(user -> user.getPersonDetails().getName() + " " + user.getPersonDetails().getSurname())
                .collect(Collectors.joining(", "));
    }

    public static List<String> getSortedPermissionsOfUsersWithNameStartingWithA(List<User> users) {
        return users.stream()
                .filter(user -> user.getName().startsWith("A"))
                .flatMap(user -> user.getPersonDetails().getRole().getPermissions().stream())
                .map(Permission::getName)
                .collect(Collectors.toList());
    }

    public static void printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(List<User> users) {
        users.stream()
                .filter(user -> user.getPersonDetails().getSurname().startsWith("S"))
                .flatMap(user -> user.getPersonDetails().getRole().getPermissions().stream())
                .map(permission -> permission.getName().toUpperCase())
                .forEach(System.out::println);
    }

    public static Map<Role, List<User>> groupUsersByRole(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(user -> user.getPersonDetails().getRole()));
    }

    public static Map<Boolean, List<User>> partitionUserByUnderAndOver18(List<User> users) {
        return users.stream().collect(Collectors.partitioningBy(user -> user.getPersonDetails().getAge() > 18));
    }
}
