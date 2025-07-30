public class BankAccount {

    private int accountNumber;
    private double accountBalance;
    private String customerName;

    // functional methods

    // Creating the constructor
    public BankAccount() {
        // You can only use constructor chaining, if it is the first line that will be executed in the constructor
        this(1234, 1000.01, "Jane");
        System.out.println("Empty Constructor called");
    };

    // Classes can have multiple constructors, we can now pass values to the constructor, and assign data to the fields instead of calling setters
    public BankAccount(int accountNumber, double accountBalance, String customerName) {
        System.out.println("Account constructor with parameters called");

        // This updates all the fields, normally all initialization is done here
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
    }

    // Third constructor
    public BankAccount(String customerName) {
        this(4567, 9391.1, customerName);
//        this.customerName = customerName;
    }

    public void depositFund(double depositAmount) {
        accountBalance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " was successfully made. New balance is $"+ accountBalance);
    };

    public void withdrawBalance(double withdrawAmount) {
        if (accountBalance - withdrawAmount < 0) {
            System.out.println("Withdrawal not successful, you only have $" + accountBalance);
        } else {
            accountBalance -= withdrawAmount;
            System.out.println("Withdrawal of $" + withdrawAmount + " was successfully made. New balance is $"+ accountBalance);
        };
    };

    // getters
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
      return customerName;
    };

    // setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    };

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    };

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    };

    // method used to described
    public void describeAccount() {
        System.out.println("The user: " + customerName + " with account number " +  accountNumber + " and a balance of: $" + accountBalance);
    }
}
