
public class IdleState implements ATMState {
    private ATM atm;

    public IdleState(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("💳 Card inserted.");
        atm.setState(new HasCardState(atm));
    }

    public void enterPin(int pin) {
        System.out.println("⚠️ Please insert your card first.");
    }

    public void requestTransaction(String type) {
        System.out.println("⚠️ Please insert your card first.");
    }
}
