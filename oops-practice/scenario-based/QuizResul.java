import java.util.*;

class InvalidQuizSubmissionException extends Exception{
    InvalidQuizSubmissionException(String msg){
        super(msg);
    }
}

class QuizResult{
    static int calcScore(String[] ca,String[] ua)throws InvalidQuizSubmissionException{
        if(ca.length!=ua.length)
            throw new InvalidQuizSubmissionException("Answer length mismatch");

        int s=0;
        for(int i=0;i<ca.length;i++){
            if(ca[i].equalsIgnoreCase(ua[i]))
                s++;
        }
        return s;
    }

    static String getGrade(int s,int t){
        double p=(s*100.0)/t;
        if(p>=80)return "A";
        if(p>=60)return "B";
        if(p>=40)return "C";
        return "F";
    }
}

public class QuizResul{
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();

        String[] ca={"A","B","C","D","A"};
        String[] ua={"A","B","D","D","A"};

        try{
            int sc=QuizResult.calcScore(ca,ua);
            list.add(sc);
            System.out.println("Score: "+sc);
            System.out.println("Grade: "+QuizResult.getGrade(sc,ca.length));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
