import java.util.*;

// custom exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

// user class
class User {
    int id;
    String name;
    Wallet wallet;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.wallet = new Wallet();
    }
}

// wallet class
class Wallet {
    double bal;
    List<Transaction> txs = new ArrayList<>();

    public void add(double amt) {
        bal += amt;
        txs.add(new Transaction("CREDIT", amt));
    }

    public void withdraw(double amt) throws InsufficientBalanceException {
        if (amt > bal)
            throw new InsufficientBalanceException("Insufficient balance");
        bal -= amt;
        txs.add(new Transaction("DEBIT", amt));
    }
}

// transaction class
class Transaction {
    String type;
    double amt;
    Date dt;

    public Transaction(String type, double amt) {
        this.type = type;
        this.amt = amt;
        this.dt = new Date();
    }
}

// transfer service interface
interface TransferService {
    void transfer(User from, User to, double amt)
            throws InsufficientBalanceException;
}

// wallet to wallet transfer
class WalletTransfer implements TransferService {
    public void transfer(User from, User to, double amt)
            throws InsufficientBalanceException {

        from.wallet.withdraw(amt);
        to.wallet.add(amt);
    }
}

// wallet to bank transfer
class BankTransfer implements TransferService {
    public void transfer(User from, User to, double amt)
            throws InsufficientBalanceException {

        from.wallet.withdraw(amt);
        System.out.println("Transferred ₹" + amt + " to bank account of " + to.name);
    }
}

// main class
public class WalletApp {
    public static void main(String[] args) {
        User u1 = new User(1, "Naman");
        User u2 = new User(2, "Amit");

        u1.wallet.add(5000);

        TransferService wt = new WalletTransfer();
        TransferService bt = new BankTransfer();

        try {
            wt.transfer(u1, u2, 1500);
            bt.transfer(u1, u2, 2000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Balance Naman: ₹" + u1.wallet.bal);
        System.out.println("Balance Amit: ₹" + u2.wallet.bal);
    }
}
