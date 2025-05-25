
public abstract class Transaction {
    public void execute() {
        System.out.println("🔐 Processing transaction...");
        performTransaction();
        System.out.println("✅ Transaction complete.");
    }

    protected abstract void performTransaction();
}
