
public class ATM {
    private ATMState currentState;
    private int balance;

    public ATM() {
        this.currentState = new IdleState(this);
        this.balance = 25000; // Initial balance
    }

    public void setState(ATMState state) {
        this.currentState = state;
    }

    public void insertCard() {
        currentState.insertCard();
    }

    public void enterPin(int pin) {
        currentState.enterPin(pin);
    }

    public void requestTransaction(String type) {
        currentState.requestTransaction(type);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }
}
