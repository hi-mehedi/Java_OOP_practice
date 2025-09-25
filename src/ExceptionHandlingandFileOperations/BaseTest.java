package ExceptionHandlingandFileOperations;

abstract class BaseTest {
    protected String testName;
    public BaseTest(String testName){
        this.testName = testName;
    }

    public void runTest() throws  TestExecutionException{
        System.out.println("Running Test :"+testName);
        double random = Math.random();
        if (random<0.3){
            throw  new TestExecutionException("Test Due to fail for random error " +testName);
        }
        else if ((random < 0.5)){
            throw  new NullPointerException("Null reference in" + testName);
        }
        else {
            System.out.println("Test executed Successfully");
        }
    }
}
