package LAB4.zad1;

public class Fraction {
    private int leastCommonMultiple(int numberA, int numberB){
        int absNumberA = Math.abs(numberA), absNumberB = Math.abs(numberB);
        int absHigherNumber = Math.max(absNumberA, absNumberB), absLowerNumber = Math.min(absNumberA, absNumberB);
        int lcm = absHigherNumber;
        while (lcm % absLowerNumber != 0){
            lcm += absHigherNumber;
        }
        return lcm;
    }
    private int greatestCommonDivisor(int numberA, int numberB){
        if (numberB == 0) return numberA;
        else return greatestCommonDivisor(numberB, numberA % numberB);
    }
    private String additionSubtraction(int numeratorA, int denominatorA, int numeratorB, int denominatorB, boolean isAddition){
        int lcm = leastCommonMultiple(denominatorA, denominatorB);
        int multiplyModifierA = lcm/denominatorA, multiplyModifierB = lcm/denominatorB;
        if(isAddition) numeratorA = numeratorA * multiplyModifierA + numeratorB * multiplyModifierB;
        else numeratorA = numeratorA * multiplyModifierA - numeratorB * multiplyModifierB;
        denominatorA = lcm;
        return numeratorA + "/" + denominatorA;
    }
    private String multiplicationDivision(int numeratorA, int denominatorA, int numeratorB, int denominatorB, boolean isMultiplication){
        if(isMultiplication){
            denominatorA *= denominatorB; numeratorA *= numeratorB;
        }
        else{
            denominatorA *= numeratorB; numeratorA *= denominatorB;
        }
        int gcd = greatestCommonDivisor(numeratorA, denominatorA);
        return numeratorA / gcd + "/" + denominatorA / gcd;
    }
    public void displayFraction(int numeratorA, int denominatorA, int numeratorB, int denominatorB, int option){
        String answer = "", character = "";
        switch (option){
            case 0 -> { answer = additionSubtraction(numeratorA, denominatorA, numeratorB, denominatorB, true); character = "+"; }
            case 1 -> { answer = additionSubtraction(numeratorA, denominatorA, numeratorB, denominatorB, false); character = "-"; }
            case 2 -> { answer = multiplicationDivision(numeratorA, denominatorA, numeratorB, denominatorB, true); character = "*"; }
            case 3 -> { answer = multiplicationDivision(numeratorA, denominatorA, numeratorB, denominatorB, false); character = "/"; }
        }
        System.out.println(numeratorA + "/" + denominatorA + " " + character + " " + numeratorB + "/" + denominatorB + " = " + answer);
    }
}
