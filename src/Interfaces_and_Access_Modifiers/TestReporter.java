package Interfaces_and_Access_Modifiers;

public interface TestReporter {
    void generateTestReport();
    void sendReport(String recipient);

    default void printSummary(){
        System.out.println("Report generated Successfully");
    }
}
