package Interfaces_and_Access_Modifiers;

public class Main {
    public static void main(String[] args) {
        TestDataFile test1 = new TestDataFile("mehedi", 1010, "Bangladesh");

        HTMLReporter htmlReporter = new HTMLReporter(test1);
        JSONReporter jsonReporter = new JSONReporter(test1);

        htmlReporter.generateTestReport();
        htmlReporter.sendReport("mehedi@gmail.com");
        htmlReporter.printSummary();

        System.out.println(".............................................");

        jsonReporter.generateTestReport();
        jsonReporter.sendReport("hasan@gmail.com");
        jsonReporter.printSummary();
    }
}
