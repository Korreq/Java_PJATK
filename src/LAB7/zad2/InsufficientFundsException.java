package LAB7.zad2;

public class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException() {
        System.out.println("Can't withdraw more than is on the account");
    }
}
