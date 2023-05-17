package LAB10.zad2;

import java.util.*;

public class Lotto {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);
    private Set<Integer> winningNumbers = new HashSet<>(), chosenNumbers = new HashSet<>();
    public Lotto(){
        for(int i = 0; i < 6; i++){ winningNumbers.add(random.nextInt(49 - 1) + 1); }
    }
    public void chooseNumbers(){
        int iteration = 0, numberCandidate;
        System.out.println("Enter 6 numbers from 1 to 49");
        while(iteration < 6){
            try{ numberCandidate = scanner.nextInt(); }
            catch (InputMismatchException e){
                System.out.println("Must be a number");
                scanner.nextLine();
                continue;
            }
            if(numberCandidate < 1 || numberCandidate > 49){
                System.out.println("Number must be in range 1-49");
                continue;
            }
            chosenNumbers.add(numberCandidate);
            iteration++;
        }
    }
    public void check(){
        int guesses = 0;
        for (int number : chosenNumbers){
            if(winningNumbers.contains(number)){
                guesses++;
            }
        }
        System.out.println("Chosen numbers: "+chosenNumbers);
        System.out.println("Wining numbers: "+winningNumbers);
        System.out.println("Guessed right: "+guesses);
    }
}
