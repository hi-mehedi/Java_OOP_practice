package TestFrameworkOopConcept;

public abstract class BaseTest {
    protected  String testName;
    protected String description;

    public BaseTest(String testName, String description){
        this.testName = testName;
        this.description = description;
    }

    public abstract void executeTest();

    public String getTestInfo(){
        return "Test Name : " + testName + ", Description :" +description;
    }
}
