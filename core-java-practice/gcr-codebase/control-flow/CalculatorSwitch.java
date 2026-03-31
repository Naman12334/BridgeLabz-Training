import java.util.*;

public class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
           double x=sc.nextDouble();
           double y=sc.nextDouble();
           String op=sc.next();
switch(op){
case "+":System.out.println(x+y);break;
case "-":System.out.println(x-y);break;
case "*":System.out.println(x*y);break;
case "/":System.out.println(x/y);break;
default:System.out.println("Invalid Operator");
    }
}   
}
