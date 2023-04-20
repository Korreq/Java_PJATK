package LAB7.zad5;

import java.util.regex.Pattern;

public class Zad5 {
    public static void main(String[] args) {
        String address = "Podwale Staromiejskie 11, 80-844 Gdańsk", name = "Polsko-Japońska Akademia Technik Komputerowych, filia w Gdańsku - Wydział Informatyki";
        Place place = new Place(address, name);
        System.out.println(place);
        Pattern pattern = Pattern.compile("\\d");
        place.getMatchedString(pattern);
    }
}
