
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
    
    public static Patient findPatient(Receptionist receptionist){
        Scanner scanner = new Scanner(System.in);
        int choic;
        do{
        System.out.println("Enter your id:");
        int patientID=scanner.nextInt();
            boolean flag=true;
            for (Patient newPatint:receptionist.patients) {
                if(newPatint.getpatientId()==patientID)
                {
                    return newPatint;
                }
            }
            System.out.println("Patint not found");
            System.out.println("1- Try again");
            System.out.println("2-back");
            choic=scanner.nextInt();
        }while (choic!=2);
        return new Patient();
    }
    public static boolean Receptionistfunc(Patient patient,int id , Receptionist receptionist){
        Scanner scanner = new Scanner(System.in);

        int  choice;
        do {
            System.out.println("Choose one of the options");
            System.out.println("1- Add Patient`s info and add Appointment ");
            System.out.println("2- show all Appointment info");
            System.out.println("3- back");
          choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    receptionist.addPatientData(patient, id);
                    break;
                case 2:
                    receptionist.printAppointments();
                    break;
                case 3:
                    return true;

                default:
                    System.out.println("Wrong choice! Try again");
            }
        }while (choice!=3);
        return true;
    }
    public static void Patientfunc(Patient patient,Receptionist receptionist) {
        Scanner scanner = new Scanner(System.in);
        Patient patient1=  findPatient(receptionist);
        if (patient1.getPhone() != null) {
            int choice;
            do {
                System.out.println("Choose one of the options");
                System.out.println("1- show my info");
                System.out.println("2- show my all Appointment info");
                System.out.println("3-show my result");
                System.out.println("4- back");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                            patient1.myInfo();
                        break;
                    case 2:

                        for (Appointment appointment:receptionist.getAppointments()) {
                            if(appointment.getState()==null) {
                                if (appointment.getPatient() == patient1) {
                                    System.out.println("Appointment ID: " + appointment.getAppointmentId());
                                    System.out.println("Date: " + appointment.getDate());
                                    System.out.println("Patient: " + appointment.getPatient().getFname() + " " + appointment.getPatient().getLname());
//                            System.out.println();
//                                    if (appointment.getState() == null) {
                                        System.out.println("do you wont cancel these Appointment (y/n)");
                                        Scanner scanner1 = new Scanner(System.in);
                                        String x = scanner1.next();
                                        switch (x){
                                            case "y":
                                                appointment.setState("canceled");
                                                System.out.println("canceled");
                                                break;

                                        }

//
                                }
                            }else{
                                System.out.println("these Appointment is canceled");
                            }
                        }
                        break;
                    case 3:
                        for (TestResult testResult:patient1.getTestResults()) {
                            System.out.println("___________test result_____________________");
                            System.out.println("name " +patient1.getFname()+""+patient1.getLname());
                            System.out.println("result: "+testResult.getResult());
                            System.out.println("________________________________");
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Wrong choice! Try again");
                }
            } while (choice != 4);
        }
        return ;
    }
    public static void LaboratorySpecialistfunc(Receptionist receptionist){
        LaboratorySpecialist laboratorySpecialist=new LaboratorySpecialist();
        System.out.println("Choose one of patient to add report&result");
//        System.out.println("");
        Scanner scanner = new Scanner(System.in);
        int i=1;
        for (Patient patient:receptionist.patients) {
            System.out.println(1+" "+patient.getFname()+" "+patient.getLname());
        int x=scanner.nextInt();
        laboratorySpecialist.sddresult(patient);

        }

    }
}
