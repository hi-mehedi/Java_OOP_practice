package TestDataManagementSystem;

public class TestUtility {

    public static int calculatorPriorityScore(TestData testData){
        return testData.isAutomated ? testData.priority * 10 : testData.priority * 5;
    }

    public static int calculatorPriorityScore(boolean isAutomated, int priority){
        return isAutomated ? priority * 10 : priority * 5;
    }

    public static void practiceOperator(){
        int testCount = 10;
        int passed = testCount ++;
        int failed = --testCount;

        System.out.println("Test Count : " +testCount);
        System.out.println("Test Passed : " +passed);
        System.out.println("Test Failed :" +failed);
    }

    public static String getStatusMessage( int statusCode){
        switch (statusCode){
            case 1 :
                return "Test Passed";
            case 2:
                return "Test Failed";
            case 3:
                return "Test Skipped";
            default:
                return "Unknown Status";
        }
    }

    public  static String formatTestResult(TestData testData, int statusCode){
        String status = getStatusMessage(statusCode);
        return String.format("Test : %s | Status : %s | Time : %.2fs", testData.testName, status , testData.executionTime);
    }

    public static  boolean isValidPriority(int priority){
        if(1<= priority && priority <= 5){
            return true;
        }
        else {
            return false;
        }
    }
}
