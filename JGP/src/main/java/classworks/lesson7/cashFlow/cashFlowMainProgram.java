package src.main.java.classworks.lesson7.cashFlow;

public class cashFlowMainProgram {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

       double currentBalance= myAccount.checkBalance();
       System.out.println(currentBalance);
        myAccount.deposit(150);
        myAccount.withdraw(155);
        myAccount.withdraw((4.44));

        System.out.println(myAccount.checkBalance());

    }
}
