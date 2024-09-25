public class test {
    public static void main(String[] args)
    {
        BankAccount ba = new BankAccount("myname", 111, 125.00, "pass");
        ba.logIn("myname","pass");
        System.out.println(ba);
        ba.deposit(1000.00);
        System.out.println(ba);
        ba.withdraw(200.00);
        System.out.println(ba);
    }
}
