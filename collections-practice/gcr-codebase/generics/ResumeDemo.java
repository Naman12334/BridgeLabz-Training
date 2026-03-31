import java.util.*;

// Abstract Job Role
abstract class JobRole {
    String name;

    JobRole(String name) {
        this.name = name;
    }

    abstract void screen();
}

// Job roles
class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }

    void screen() {
        System.out.println("Screening Software Engineer Resume");
    }
}

class DataScientist extends JobRole {
    DataScientist() {
        super("Data Scientist");
    }

    void screen() {
        System.out.println("Screening Data Scientist Resume");
    }
}

// Generic Resume class
class Resume<T extends JobRole> {
    T role;

    Resume(T role) {
        this.role = role;
    }

    void process() {
        role.screen();
    }
}

// Wildcard utility
class ResumeProcessor {
    static void processAll(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            role.screen();
        }
    }
}

// Main
public class ResumeDemo {
    public static void main(String[] args) {
        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());

        ResumeProcessor.processAll(roles);
    }
}
