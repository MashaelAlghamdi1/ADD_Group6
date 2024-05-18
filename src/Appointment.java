
public class Appointment {
        private int appointmentId;
    private String date;
    private String state;
    private Receptionist receptionist; // Association with Receptionist
    private Patient patient; // Association with Patient

    public Appointment(int appointmentId, String date, Receptionist receptionist, Patient patient) {
        this.appointmentId = appointmentId;
        this.date = date;
        this.receptionist = receptionist;
        this.patient = patient;
    }
    public int getAppointmentId() {
        return appointmentId;
    }
    public String getState(){
        return this.state;
    }
    public void setState(String state){
        this.state=state;
    }

    public String getDate() {
        return date;
    }

    public Patient getPatient() {
        return patient;
    }

    public Appointment() {

    }
}
