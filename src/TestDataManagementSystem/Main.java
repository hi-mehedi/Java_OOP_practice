package TestDataManagementSystem;

public class Main {
    public static void main(String[] args) {
        TestData  test1 = new TestData(101,"Login Page",false, 2.35, 9);
        TestUtility.practiceOperator();
        double score = TestUtility.calculatorPriorityScore(test1);
        System.out.println("Priority Score : " +score);
        double score1 = TestUtility.calculatorPriorityScore(test1.isAutomated,test1.priority);
        System.out.println("Priority Score : "+score1);
        System.out.println(TestUtility.getStatusMessage(1));
        System.out.println(TestUtility.formatTestResult(test1,1));
        System.out.println("Test Priority : " +TestUtility.isValidPriority(2));
    }
}
