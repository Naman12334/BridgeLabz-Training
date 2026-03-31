import java.util.*;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
             double w=sc.nextDouble();
             double h=sc.nextDouble();
                 h=h/100;
            double bmi=w/(h*h);
               System.out.println(bmi);
if(bmi<18.5)System.out.println("Underweight");
else if(bmi<25)System.out.println("Normal");
else if(bmi<30)System.out.println("Overweight");
else System.out.println("Obese");
        
    }
    
}
