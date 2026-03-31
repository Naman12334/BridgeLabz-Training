import java.util.*;

public class SpringSeoson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        if(month>=3 && month<=6){
            if(day<=20 && day>0){
                System.out.println("Its a spring season");
            }
        }
        System.out.println("its not a spring season");
    }
    
}
