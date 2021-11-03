package lecture18Examples;

public class BankAccountDriver {
    public static void main(String[] args) {
        //BankAccount ba = new BankAccount(100, "Kiran");


        SavingsAccount ac = new SavingsAccount(200.0, "Jones", 0.5);
        ac.deposit(400);

        SavingsAccount otherAccount = new SavingsAccount(500.0, "Smith", 0.5);

        System.out.println(ac.compareTo(otherAccount));

        /*try {
            ac.withdraw(10);
        }
        catch (InsufficientFundsException e) {
            System.out.println(e);
        }
        ac.applyInterest();
        System.out.println(ac);
        */
    }
}
