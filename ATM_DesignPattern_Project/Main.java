
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- ATM Machine ---");
            System.out.println("1. Insert Card");
            System.out.println("2. Exit");
            System.out.print("Choose option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                atm.insertCard();
                System.out.print("Enter PIN: ");
                int pin = scanner.nextInt();
                atm.enterPin(pin);

                System.out.println("Choose transaction: withdraw / deposit / balance");
                String transactionType = scanner.next();
                atm.requestTransaction(transactionType);
            } else {
                System.out.println("👋 Exiting. Thank you!");
                break;
            }
        }

        scanner.close();
    }
}
