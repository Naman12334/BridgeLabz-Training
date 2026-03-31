abstract class Product{
    private int id;
    private String name;
    protected double price;

    Product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    abstract double calculateDiscount();
}

interface Taxable{
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable{
    Electronics(int id,String n,double p){
        super(id,n,p);
    }

    double calculateDiscount(){
        return price*0.1;
    }

    public double calculateTax(){
        return price*0.18;
    }

    public String getTaxDetails(){
        return "18% GST";
    }
}

class Clothing extends Product{
    Clothing(int id,String n,double p){
        super(id,n,p);
    }

    double calculateDiscount(){
        return price*0.2;
    }
}

class E-Commerce{
    static void finalPrice(Product p){
        double tax=0;
        if(p instanceof Taxable)
            tax=((Taxable)p).calculateTax();

        System.out.println("Final Price:"+ (p.price+tax-p.calculateDiscount()));
    }

    public static void main(String[] args){
        Product p=new Electronics(1,"TV",50000);
        finalPrice(p);
    }
}

