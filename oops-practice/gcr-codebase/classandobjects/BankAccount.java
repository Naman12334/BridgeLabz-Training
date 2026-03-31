class BankAccount {
    String name, accNo;
    double bal;

    void showBal() {
        System.out.println("Current balance: " + bal);
    }

    void deposit(double amt) {
        bal += amt;
        System.out.println("Deposited: " + amt);
        showBal();
    }

    void withdraw(double amt) {
        if (bal >= amt) {
            bal -= amt;
            System.out.println("Withdraw amount is : " + amt);
            showBal();
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.name = "State of Chennai";
        b.accNo = "12345";
        b.bal = 700;

        System.out.println(b.name);
        b.showBal();
        b.deposit(200);
        b.withdraw(100);
        b.withdraw(1000);
    }
}
