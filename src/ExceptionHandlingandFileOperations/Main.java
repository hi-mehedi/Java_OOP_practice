package ExceptionHandlingandFileOperations;

public class Main {
    public static void main(String[] args) {
        BaseTest test1 = new UITest("Login Function");
        BaseTest test2 = new UITest("Registration Function");

        for (BaseTest test : new BaseTest[]{test1, test2}){
            try {
                test.runTest();
            }
            catch (TestExecutionException e){
                System.out.println("Caught custom exception :" + e.getMessage());
            }
            catch (NullPointerException e){
                System.out.println("Caught Null pointer exception :" + e.getMessage());
            }
            catch (Exception e){
                System.out.println("Caught Generale exception :" +e.getMessage());
            }
            finally {
                System.out.println("Cleaning up resource :" +test.testName);
                System.out.println("....................................");
            }
        }
    }
}
