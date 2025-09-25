package TestFrameworkOopConcept;

public class UITest extends BaseTest{
    private String browserType;

    public UITest(String testName , String browserType){
        super(testName , browserType);
        this.browserType = browserType;
    }

    @Override
    public void executeTest() {
        System.out.println(getTestInfo());
        System.out.println("Browser Type :"+browserType);
    }
}
