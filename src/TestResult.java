
public class TestResult {
        private int testId;
    private String result;
    private LaboratorySpecialist specialist; // Association with LaboratorySpecialist
    private Report report; // Composition with Report
    public TestResult(int testId, String result, LaboratorySpecialist specialist) {
        this.testId = testId;
        this.result = result;
        this.specialist = specialist;
        this.report = new Report();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public TestResult() {

    }
}
