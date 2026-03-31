import java.util.*;

public class PersonCanVoteORNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("the person age is" + age + "can vote");
        }else{
            System.out.println("the person age is" + age + "can not vote");
        }
        
    }
    
}
