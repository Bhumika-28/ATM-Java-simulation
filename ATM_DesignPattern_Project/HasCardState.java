
public class HasCardState implements ATMState {
    private ATM atm;

    public HasCardState(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("⚠️ Card already inserted.");
    }

    public void enterPin(int pin) {
        if (pin == 1234) {
            System.out.println("✅ PIN correct.");
        } else {
            System.out.println("❌ PIN incorrect.");
        }
    }

    public void requestTransaction(String type) {
        System.out.println("🔄 Authenticating...");
        Transaction txn;

        switch (type.toLowerCase()) {
            case "withdraw":
                txn = new WithdrawTransaction(atm);
                break;
            case "deposit":
                txn = new DepositTransaction();
                break;
            case "balance":
                txn = new BalanceTransaction(atm);
                break;
            default:
                System.out.println("⚠️ Invalid transaction type.");
                return;
        }

        txn.execute();
        System.out.println("💳 Card ejected.\n");
        atm.setState(new IdleState(atm));
    }
}
