import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Receptionist {
        private String name;
    private String employeeId;
    public List<Patient> patients=new ArrayList<>();
    private List<Appointment> appointments=new ArrayList<>();
    public Receptionist(String name, String employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    Receptionist() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void addPatientData(Patient patient, int id) {
        // Update patient's personal information
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter patient's first name: ");
        String fname = scanner.nextLine();

        System.out.println("Enter patient's last name: ");
        String lname = scanner.nextLine();

        System.out.println("Enter patient's phone number: ");
        String phone = scanner.nextLine();

        patient.setFname(fname);
        patient.setLname(lname);
        patient.setPhone(phone);
        patient.setPatientId(id);
        this.patients.add(patient);
        addAppointment(patient,id);
        System.out.println("Patient data added successfully by receptionist " + name + "     Patient ID: "+patient.getpatientId());
    }

    public void addAppointment(Patient patient, int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Appointment date: ");
        String date = scanner.nextLine();
        Appointment appointment = new Appointment(id, date, this, patient);

        appointments.add(appointment);
    }

    public void printAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
        } else {
            System.out.println("All Appointments:");
            for (Appointment appointment : appointments) {
                System.out.println("Appointment ID: " + appointment.getAppointmentId());
                System.out.println("Date: " + appointment.getDate());
                System.out.println("Patient: " + appointment.getPatient().getFname() + " " + appointment.getPatient().getLname());
                System.out.println();
            }
        }
    }
}
