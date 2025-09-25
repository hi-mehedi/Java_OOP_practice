package TestFrameworkOopConcept;

public class APITest extends BaseTest{
    public String endPoint;

    public APITest(String testName,  String endPoint){
        super(testName, endPoint);
        this.endPoint =endPoint;
    }

    @Override
    public void executeTest() {
        System.out.println(getTestInfo());
        System.out.println("Endpoint :"+endPoint);
    }
}
