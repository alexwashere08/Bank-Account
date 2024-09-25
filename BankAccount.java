                              public class BankAccount
 {
       private String name;
       private int accountNum;
       private double balance;
       private String password;
       private boolean loggedIn;

    public BankAccount(String name, int accountNum, double balance, String password)
    {
        this.name = name;
        this.accountNum = accountNum;
        this.balance = balance;
        this.password = password;
        this.loggedIn = false;
    }

    public boolean logIn(String name, String password)
    {
        if(name.equals(this.name) && password.equals(this.password))
        {
            loggedIn = true;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean withdraw(double amount)
    {
        if(loggedIn == true)
        {
            balance -= amount;
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean deposit(double amount)
    {
        if(loggedIn == true)
        {
            balance += amount;
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        return "Account Number: " + accountNum + "Balance: " + balance;
    }
}
