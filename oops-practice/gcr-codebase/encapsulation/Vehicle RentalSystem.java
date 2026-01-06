

abstract class Vehicle{
    private String no;
    protected double rate;

    Vehicle(String no,double rate){
        this.no=no;
        this.rate=rate;
    }

    abstract double calculateRentalCost(int d);
}

interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable{
    Car(String no,double r){
        super(no,r);
    }

    double calculateRentalCost(int d){
        return rate*d;
    }

    public double calculateInsurance(){
        return 500;
    }

    public String getInsuranceDetails(){
        return "Car Insurance";
    }
}

class VehicleRentalSystem{
    public static void main(String[] args){
        Vehicle v=new Car("DL01",2000);
        System.out.println(v.calculateRentalCost(3));
    }
}
