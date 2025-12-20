import java.util.*;

public class BonusAmountCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int year = sc.nextInt();
        if(year>=5){
            int bonus = (salary * 5)/100;
            System.out.println(bonus);
           
        }else{
            System.out.println("not increment");
        }
    }
    
}
