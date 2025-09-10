package Fundamentals.Bank;

public class BankOOP {
    public static void main(String[] args) {

        // This is creating an implicit default constructor since it is not declared, but since we have one, java uses it now
//        Fundamentals.Bank.BankAccount userAccount = new Fundamentals.Bank.BankAccount(3213, 123.02, "John"); // With the constructor, now we can input the values here
//        userAccount.setAccountBalance(123.02);
//        userAccount.setAccountNumber(3213);
//        userAccount.setCustomerName("John");


        // This uses constructor chaining.
        BankAccount userAccount = new BankAccount();
        userAccount.withdrawBalance(64.02);
        userAccount.depositFund(2314.2);
        userAccount.describeAccount();

        // Constructor overloading, calling the constructor with one parameter
        BankAccount newAccount = new BankAccount("Joe");
        System.out.println("Account Number:" + newAccount.getAccountNumber() + "; name " + newAccount.getCustomerName());
    };
};
