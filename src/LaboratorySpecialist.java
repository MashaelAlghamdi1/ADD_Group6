import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HC-atiaf
 */
public class LaboratorySpecialist {
        private String name;
    private String specialization;
    private List<TestResult> testResults; // Association with TestResult

    public LaboratorySpecialist(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;

    }

    public LaboratorySpecialist() {

    }

    public void sddresult(Patient patient){
    Scanner scanner = new Scanner(System.in);
    System.out.println("_______________________-");
        patient.myInfo();
        System.out.print("enter result:");
        String result=scanner.nextLine();
        TestResult testResult=new TestResult();
        testResult.setResult(result);
        patient.setTestResults(testResult);
    System.out.println("______________________");
    System.out.println("dun Test Results added successfully");

}
}
