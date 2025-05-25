
import java.util.Scanner;

public class WithdrawTransaction extends Transaction {
    private ATM atm;

    public WithdrawTransaction(ATM atm) {
        this.atm = atm;
    }

    protected void performTransaction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("💵 Enter amount to withdraw: ₹");
        int amount = sc.nextInt();

        if (amount <= atm.getBalance()) {
            atm.setBalance(atm.getBalance() - amount);
            System.out.println("✅ Withdrawal of ₹" + amount + " successful.");
            System.out.println("🏦 Remaining balance: ₹" + atm.getBalance());
        } else {
            System.out.println("❌ Insufficient funds. Your balance is ₹" + atm.getBalance());
        }
    }
}
