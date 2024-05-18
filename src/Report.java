import java.util.ArrayList;
import java.util.List;

public class Report {
        private int reportId;
    private String content;
    private List<TestResult> testResults; // Composition with TestResult

    public Report(int reportId, String content) {
        this.reportId = reportId;
        this.content = content;
        this.testResults = new ArrayList<>();
    }

    public Report() {

    }
}
