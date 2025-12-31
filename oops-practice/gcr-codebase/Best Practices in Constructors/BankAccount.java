class BankAccount {
    public int accNo;
    protected String holder;
    private double bal;

    void setBalance(double bal) {
        this.bal = bal;
    }

    double getBalance() {
        return bal;
    }
}

class SavingsAccount extends BankAccount {
    void show() {
        System.out.println(accNo + " " + holder);
    }
}
