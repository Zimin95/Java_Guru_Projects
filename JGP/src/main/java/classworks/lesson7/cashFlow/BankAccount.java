package src.main.java.classworks.lesson7.cashFlow;

public class BankAccount {

    double amount;
    public BankAccount(){
        this.amount = 0;

    }
    void withdraw(double amount){
        if(this.amount>=amount){
    this.amount = this.amount- amount;}
        else System.out.println("You don't have enough money");
    }
    void deposit(double amount){
      this.amount=this.amount+amount;

    }
    double checkBalance(){
       return this.amount;

    }
}
