import java.util.*;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        float m = sc.nextFloat();
        float add = n + m;
        float sub = n - m;
        float mul = n*m;
        float div = m / n;
        System.out.println(" The addition, subtraction, multiplication and division value of 2 numbers" + add + sub + mul + div);
        
    }
    
}
