
import java.util.*;

public class LabTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Receptionist receptionist = new Receptionist("Alice", "R123");
         Patient patient = new Patient();
        int id=0;
        int choice;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Choose one of the options(how you are?)");
            System.out.println("1- Receptionist");
            System.out.println("2- Patient");
            System.out.println("3- LaboratorySpecialist");
            System.out.println("4- Exit");
//            System.out.println("Choose one of the options");
            choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    if(Receptionistfunc(patient, ++id, receptionist)) {
                        break;
                    }
                    break;
                case 2:
                    Patientfunc(patient,receptionist);
                    break;
                case 3:
                    LaboratorySpecialistfunc(receptionist);
                    break;
                case 4:
                    System.out.println("Thank You ...!");
                    break;
                default :
                    System.out.println("Wrong choice! Try again");
            }
            System.out.println("\n\n");
        }while (choice != 4);
    }
    
}
