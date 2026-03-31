import java.util.*;

public class BMIFitnessTracker {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);      
          double weight = scanner.nextDouble();       
          double height = scanner.nextDouble();    
          double bmi = weight / (height * height);    
          System.out.println("BMI: " + bmi);      
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }

        
    }
    
}
