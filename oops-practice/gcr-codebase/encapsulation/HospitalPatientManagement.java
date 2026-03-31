abstract class Patient{
    private int id;
    private String name;

    Patient(int id,String n){
        this.id=id;
        name=n;
    }

    abstract double calculateBill();

    void getPatientDetails(){
        System.out.println(id+" "+name);
    }
}

interface MedicalRecord{
    void addRecord(String r);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord{
    private double days;

    InPatient(int id,String n,double d){
        super(id,n);
        days=d;
    }

    double calculateBill(){
        return days*2000;
    }

    public void addRecord(String r){
        System.out.println(r);
    }

    public void viewRecords(){
        System.out.println("Viewing Records");
    }
}
