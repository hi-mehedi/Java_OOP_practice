package Interfaces_and_Access_Modifiers;

public class HTMLReporter implements TestReporter {
    private  TestDataFile dataFile;

    public HTMLReporter(TestDataFile dataFile){
        this.dataFile = dataFile;
    }

    @Override
    public void generateTestReport() {
        System.out.println("Test report generate successful");
    }

    @Override
    public void sendReport(String recipient) {
        System.out.println("Reporter mail :" +recipient);
    }
}
