public class Homework {

    public static void main(String[] args) {

        Account acc1 = new Account("Leon Kennedy", "12349991122", 15000);

        Account acc2 = new Account("Leon Kennedy", "12349991122", 10000);

        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());

        acc2.debit(3500);

        System.out.println(acc2.getBalance());

        acc2.credit(5500);

        System.out.println(acc2.getBalance());

        SavingsAccount saving1 = new SavingsAccount("Ada Wong", "286492364374", 22000);
        saving1.debit(2300);

        System.out.println(saving1.getBalance());

        System.out.println(saving1.isSavingsAcc());
    }

}

class Account{

    private String holder_name;
    private String acc_no;
    private float balance;

    public Account(String holder_name, String acc_no, float balance) {
        this.holder_name = holder_name;
        this.acc_no = acc_no;
        this.balance = balance;
    }

    public String getHolder_name() {
        return holder_name;
    }

    public void setHolder_name(String holder_name) {
        this.holder_name = holder_name;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void debit(int amount){
        this.balance -= amount;
//        this.balance = this.balance - amount;
    }

    public void credit(int amount){
        this.balance += amount;
//        this.balance = this.balance + amount;
    }
}

class SavingsAccount extends Account {

    private boolean savingsAcc = true;

    public SavingsAccount(String holder_name, String acc_no, float balance) {
        super(holder_name, acc_no, balance);
    }

    public boolean isSavingsAcc() {
        return savingsAcc;
    }

}

class CurrentAccount extends Account {

    private boolean currentAcc = true;

    public CurrentAccount(String holder_name, String acc_no, float balance) {
        super(holder_name, acc_no, balance);
    }

    public boolean isCurrentAcc() {
        return currentAcc;
    }

}