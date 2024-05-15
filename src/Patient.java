import java.util.ArrayList;
import java.util.List;

public class Patient {
       private String fname;
    private String lname;
    private String phone;
    private int patientId;

    private List<TestResult>testResults=new ArrayList<>();
    public Patient(String fname, String lname,String phone,int id){
        this.fname=fname;
        this.lname=lname;
        this.patientId=id;
        this.phone=phone;
    }

    public List<TestResult> getTestResults() {
        return testResults;
    }

    public void setTestResults(TestResult testResult) {
        this.testResults.add(testResult);
    }

    public Patient() {

    }
    public String getFname() {
        return fname;
    }
//    public void setAppointments(Appointment appointment) {
//        appointments.add(appointment);
//    }
    public int getpatientId() {
        return patientId;
    }
    public String getLname() {
        return lname;
    }

    public String getPhone() {
        return phone;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPatientId(int id) {
        this.patientId = id;
    }
    public void myInfo() {
        System.out.println("Patient ID: " + this.getpatientId());
        System.out.println("Name: " + this.getFname() + " " + this.getLname());
        System.out.println("Phone: " + this.getPhone());
    } 
}
