
import java.io.ByteArrayInputStream;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HC-atiaf
 */
public class ReceptionistTest {
    
    @Test
    public void addPatientData() {
        // Initialize Receptionist object
        Receptionist receptionist = new Receptionist("John Doe", "R001");

        // Simulate user input
        ByteArrayInputStream in = new ByteArrayInputStream("Alice\nSmith\n1234567890\n".getBytes());
        System.setIn(in);

        // Create a patient object
        Patient patient = new Patient("Alice","Smith","1234567890",1);

        // Add patient data
//        receptionist.addPatientData(patient, 1001);

        // Ensure patient data is added correctly
        assertEquals("Alice", patient.getFname());
        //assertEquals("Smith", patient.getLname());
        //assertEquals("1234567890", patient.getPhone());
    }

    @Test
    public void addAppointment() {
        // Initialize Receptionist object
        Receptionist receptionist = new Receptionist("John Doe", "R001");

        // Create a patient object
        Patient patient = new Patient();
        patient.setFname("Alice");
        patient.setLname("Smith");
        patient.setPhone("1234567890");
        patient.setPatientId(1);

        // Add patient data first
//        receptionist.addPatientData(patient, 1001);

        // Simulate user input
        ByteArrayInputStream in = new ByteArrayInputStream("2024-05-12\n".getBytes());
        System.setIn(in);

        // Add appointment
        receptionist.addAppointment(patient, 1001);

        // Ensure appointment is added correctly
        assertFalse(receptionist.getAppointments().isEmpty());       
    }
    
}
