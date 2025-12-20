import java.util.*;

public class MarksPercentAndGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int p=sc.nextInt();
         int c=sc.nextInt();
        int m=sc.nextInt();
        int avg=(p+c+m)/3;
        System.out.println("Average:"+avg);
        if(avg>=90)System.out.println("Grade A");
        else if(avg>=75)System.out.println("Grade B");
        else if(avg>=50)System.out.println("Grade C");
        else System.out.println("Fail");
    }
    
}
