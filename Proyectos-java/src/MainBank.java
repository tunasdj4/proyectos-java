public class MainBank {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", 100);

        System.out.println(acc.deposit(50));
        System.out.println(acc.withdraw(30));
        System.out.println(acc.withdraw(200));

        acc.deactivateAccount();
        System.out.println(acc.isActive());

    }
}
