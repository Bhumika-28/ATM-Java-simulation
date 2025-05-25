
public class BalanceTransaction extends Transaction {
    private ATM atm;

    public BalanceTransaction(ATM atm) {
        this.atm = atm;
    }

    protected void performTransaction() {
        System.out.println("📊 Available Balance: ₹" + atm.getBalance());
    }
}
