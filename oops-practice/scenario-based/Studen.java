import java.util.*;

//Custom Exception
class InvalidMarkException extends Exception{
    InvalidMarkException(String msg){
        super(msg);
    }
}

class Student{
    String name;
    int[] m;
    String[] sub;

    Student(String name,String[] sub,int[] m)throws InvalidMarkException{
        this.name=name;
        this.sub=sub;
        this.m=m;

        for(int x:m){
            if(x<0||x>100)
                throw new InvalidMarkException("Marks must be 0–100");
        }
    }

    double avg(){
        int s=0;
        for(int x:m)s+=x;
        return s/(double)m.length;
    }

    String grade(){
        double a=avg();
        if(a>=80)return "A";
        if(a>=60)return "B";
        if(a>=40)return "C";
        return "F";
    }

    void show(){
        System.out.println("Name: "+name);
        for(int i=0;i<sub.length;i++)
            System.out.println(sub[i]+": "+m[i]);
        System.out.println("Average: "+avg());
        System.out.println("Grade: "+grade());
        System.out.println("-------------------");
    }
}

public class Studen{
    public static void main(String[] args){
        List<Student> list=new ArrayList<>();

        String[] sub={"Math","Science","English"};
        int[] m={85,70,90};

        try{
            Student s=new Student("Rahul",sub,m);
            list.add(s);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        for(Student s:list)
            s.show();
    }
}
