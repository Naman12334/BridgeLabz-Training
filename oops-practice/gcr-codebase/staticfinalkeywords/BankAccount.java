package com.bridgelabz.oops.inbuiltfunction;

public class BankAccount {

    private static String bankName = "State bank of India";
    private static int totAcc = 0;

    private final String accNo;
    private String name;
    private double bal;

    public BankAccount(String name, String accNo, double bal) {
        this.name = name;
        this.accNo = accNo;
        this.bal = bal;
        totAcc++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totAcc);
    }

    public void show() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + name);
            System.out.println("Account Number: " + accNo);
            System.out.println("Balance: $" + bal);
        }
    }

    public void deposit(double amt) {
        if (amt > 0)
            bal += amt;
        System.out.println("Deposited: $" + amt);
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= bal) {
            bal -= amt;
            System.out.println("Withdrawn: $" + amt);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount("Lynda Princy", "ACC12345", 1000);
        BankAccount a2 = new BankAccount("Prince Danish", "ACC67890", 500);

        a1.show();
        a2.show();

        getTotalAccounts();

        a1.deposit(200);
        a1.withdraw(150);
        a1.show();

        a2.deposit(100);
        a2.withdraw(800);
    }
}
