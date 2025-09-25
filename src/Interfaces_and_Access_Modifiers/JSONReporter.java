package Interfaces_and_Access_Modifiers;

public class JSONReporter implements TestReporter{
    private TestDataFile dataFile;

    public JSONReporter(TestDataFile dataFile){
        this.dataFile = dataFile;
    }
    @Override
    public void generateTestReport( ) {
        System.out.println("json report successful");
    }

    @Override
    public void sendReport(String recipient) {
        System.out.println("Sent reporter mail :" +recipient);
    }
}
