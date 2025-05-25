
public interface ATMState {
    void insertCard();
    void enterPin(int pin);
    void requestTransaction(String type);
}
