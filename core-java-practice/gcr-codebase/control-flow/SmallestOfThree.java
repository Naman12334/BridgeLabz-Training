import java.util.*;
public class SmallestOfThree{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1  = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        if(number1 < number2 && number1<number3){
            System.out.println("is the first number is smallest" + "YES");
        }else{
             System.out.println("is the first number is smallest" + "No");

        }
    }
}