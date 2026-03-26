public class BankAccount {
    private String accountNumber;
    private double balance;
    private boolean active;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance < 0 ? 0 : balance;
        this.active = true;
    }


    public double deposit(double amount){
        if (!this.active){
            return -1;
        }
        if (amount <= 0){
            return -1;
        }

        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount){
        if (!this.active){
            return -1;
        }
        if(amount <= 0){
            return -1;
        }
        if(this.balance - amount < 0){
            return -1;
        }
        balance -= amount;
        return this.balance;
    }

    public void deactivateAccount(){
        this.active = false;
    }

    public double getBalance(){
        return this.balance;
    }

    public boolean isActive(){
        return this.active;
    }

}
