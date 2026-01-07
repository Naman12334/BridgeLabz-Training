import java.util.*;


class NoDriverAvailableException extends Exception{
    public NoDriverAvailableException(String msg){
        super(msg);
    }
}


interface FareCalculator{
    double calcFare(double km);
}

class NormalFare implements FareCalculator{
    public double calcFare(double km){
        return km*10;
    }
}


class PeakFare implements FareCalculator{
    public double calcFare(double km){
        return km*15;
    }
}


class User{
    String name;
    public User(String name){
        this.name=name;
    }
}


class Driver{
    String name;
    boolean avail;

    public Driver(String name){
        this.name=name;
        this.avail=true;
    }
}


class Ride{
    User user;
    Driver driver;
    double km;
    double fare;

    public Ride(User user,Driver driver,double km,double fare){
        this.user=user;
        this.driver=driver;
        this.km=km;
        this.fare=fare;
    }

    public void showRide(){
        System.out.println("User: "+user.name);
        System.out.println("Driver: "+driver.name);
        System.out.println("Distance: "+km+" km");
        System.out.println("Fare: ₹"+fare);
        System.out.println("---------------------");
    }
}


public class CarBooking{
    static List<Driver> dlist=new ArrayList<>();
    static List<Ride> rh=new ArrayList<>();

    static Driver getDriver()throws NoDriverAvailableException{
        for(Driver d:dlist){
            if(d.avail){
                d.avail=false;
                return d;
            }
        }
        throw new NoDriverAvailableException("No driver available currently");
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

      
        dlist.add(new Driver("Ramesh"));
        dlist.add(new Driver("Suresh"));
        dlist.add(new Driver("Mahesh"));

        System.out.print("Enter user name: ");
        String uname=sc.nextLine();
        User u=new User(uname);

        while(true){
            System.out.println("\n1.Book Ride\n2.Ride History\n3.Exit");
            int ch=sc.nextInt();

            if(ch==1){
                try{
                    System.out.print("Enter distance (km): ");
                    double km=sc.nextDouble();

                    System.out.print("Peak hours? (yes/no): ");
                    String p=sc.next();

                    FareCalculator fc;
                    if(p.equalsIgnoreCase("yes"))
                        fc=new PeakFare();
                    else
                        fc=new NormalFare();

                    double fare=fc.calcFare(km);
                    Driver d=getDriver();

                    Ride r=new Ride(u,d,km,fare);
                    rh.add(r);

                    System.out.println("Ride booked successfully");
                    System.out.println("Driver assigned: "+d.name);
                    System.out.println("Fare: ₹"+fare);

                }catch(NoDriverAvailableException e){
                    System.out.println(e.getMessage());
                }
            }
            else if(ch==2){
                if(rh.isEmpty()){
                    System.out.println("No rides found");
                }else{
                    for(Ride r:rh){
                        r.showRide();
                    }
                }
            }
            else{
                System.out.println("Thank you for using Cab Service");
                break;
            }
        }
    }
}
