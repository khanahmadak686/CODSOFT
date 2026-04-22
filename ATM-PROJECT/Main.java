public class Main {

    public static void main(String[] args) {

        // Create bank account with initial balance
        BankAccount userAccount = new BankAccount(1000);

        // Create ATM and link account
        ATM atm = new ATM(userAccount);

        // Start ATM
        atm.showMenu();
    }
}