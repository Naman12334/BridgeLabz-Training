import java.util.*;

// custom exception
class ExamTimeExpiredException extends Exception {
    public ExamTimeExpiredException(String msg) {
        super(msg);
    }
}

// student class
class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// question class
class Question {
    int id;
    String ques;
    String ans;
    int marks;

    public Question(int id, String ques, String ans, int marks) {
        this.id = id;
        this.ques = ques;
        this.ans = ans;
        this.marks = marks;
    }
}

// evaluation strategy interface
interface EvaluationStrategy {
    int evaluate(Question q, String subAns);
}

// objective evaluation
class ObjectiveEval implements EvaluationStrategy {
    public int evaluate(Question q, String subAns) {
        return q.ans.equalsIgnoreCase(subAns) ? q.marks : 0;
    }
}

// descriptive evaluation
class DescriptiveEval implements EvaluationStrategy {
    public int evaluate(Question q, String subAns) {
        if (subAns.length() >= q.ans.length() / 2)
            return q.marks / 2;
        return 0;
    }
}

// exam class
class Exam {
    Map<Integer, Question> qMap = new HashMap<>();
    Map<Integer, Student> sMap = new HashMap<>();
    Map<Integer, Map<Integer, String>> aMap = new HashMap<>();

    long endTime;

    public Exam(int mins) {
        endTime = System.currentTimeMillis() + mins * 60 * 1000;
    }

    // create exam (add question)
    public void addQuestion(Question q) {
        qMap.put(q.id, q);
    }

    // student enrollment
    public void enroll(Student s) {
        sMap.put(s.id, s);
        aMap.put(s.id, new HashMap<>());
    }

    // answer submission
    public void submitAns(int sid, int qid, String ans)
            throws ExamTimeExpiredException {

        if (System.currentTimeMillis() > endTime)
            throw new ExamTimeExpiredException("Exam time expired");

        aMap.get(sid).put(qid, ans);
    }

    // result generation
    public int getResult(int sid, EvaluationStrategy es) {
        int score = 0;
        Map<Integer, String> ans = aMap.get(sid);

        for (int qid : ans.keySet()) {
            Question q = qMap.get(qid);
            score += es.evaluate(q, ans.get(qid));
        }
        return score;
    }
}

// main class
public class OnlineExamApp {
    public static void main(String[] args) {
        Exam ex = new Exam(5); // 5 minutes

        ex.addQuestion(new Question(1, "2+2", "4", 5));
        ex.addQuestion(new Question(2, "Java OOP", "Object Oriented", 10));

        Student s = new Student(101, "Naman");
        ex.enroll(s);

        try {
            ex.submitAns(101, 1, "4");
            ex.submitAns(101, 2, "Object Oriented Programming");
        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }

        EvaluationStrategy obj = new ObjectiveEval();
        EvaluationStrategy des = new DescriptiveEval();

        System.out.println("Objective Score: " + ex.getResult(101, obj));
        System.out.println("Descriptive Score: " + ex.getResult(101, des));
    }
}
