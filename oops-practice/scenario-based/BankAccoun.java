import java.util.*;
import java.time.*;

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
    String time;

    public Ride(User user,Driver driver,double km,double fare,String time){
        this.user=user;
        this.driver=driver;
        this.km=km;
        this.fare=fare;
        this.time=time;
    }

    public void showRide(){
        System.out.println("User: "+user.name);
        System.out.println("Driver: "+driver.name);
        System.out.println("Distance: "+km+" km");
        System.out.println("Time: "+time);
        System.out.println("Fare: ₹"+fare);
        System.out.println("---------------------");
    }
}

public class BankAccoun{
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

    static boolean isPeakTime(){
        LocalTime now=LocalTime.now();

        LocalTime mStart=LocalTime.of(7,0);
        LocalTime mEnd=LocalTime.of(9,0);

        LocalTime eStart=LocalTime.of(17,0);
        LocalTime eEnd=LocalTime.of(20,0);

        return (now.isAfter(mStart)&&now.isBefore(mEnd)) ||
               (now.isAfter(eStart)&&now.isBefore(eEnd));
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

                    FareCalculator fc;
                    if(isPeakTime()){
                        fc=new PeakFare();
                        System.out.println("Peak Time Detected");
                    }else{
                        fc=new NormalFare();
                        System.out.println("Normal Time");
                    }

                    double fare=fc.calcFare(km);
                    Driver d=getDriver();

                    String t=LocalTime.now().toString();
                    Ride r=new Ride(u,d,km,fare,t);
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
