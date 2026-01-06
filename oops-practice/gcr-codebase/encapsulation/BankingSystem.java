abstract class BankingSystem {
    private int acc;
    private String name;
    protected double bal;

    BankAccount(int acc,String name,double bal){
        this.acc=acc;
        this.name=name;
        this.bal=bal;
    }

    void deposit(double a){
        bal+=a;
    }

    void withdraw(double a){
        if(a<=bal)
            bal-=a;
    }

    abstract double calculateInterest();
}

interface Loanable{
    void applyForLoan();
    double calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable{
    SavingsAccount(int a,String n,double b){
        super(a,n,b);
    }

    double calculateInterest(){
        return bal*0.04;
    }

    public void applyForLoan(){
        System.out.println("Loan Applied");
    }

    public double calculateLoanEligibility(){
        return bal*5;
    }
}
