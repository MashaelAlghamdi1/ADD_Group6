
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LaboratorySpecialistTest {
    
    @Test
    public void testAddResult() {
        // Initialize LaboratorySpecialist object
        LaboratorySpecialist labSpecialist = new LaboratorySpecialist("Dr. Smith", "Microbiology");

        // Mock Patient object
        Patient patient = new Patient("John", "Doe", "1234567890", 1001);

        // Mock user input
        ByteArrayInputStream in = new ByteArrayInputStream("Positive".getBytes());
        System.setIn(in);

        // Redirect output stream to capture printed messages
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call the method to add result
        labSpecialist.sddresult(patient);

        // Ensure the result is added correctly to the patient's test results
        assertEquals("Positive", patient.getTestResults().get(0).getResult());

    }
    
}
