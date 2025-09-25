package TypeCastingandinstanceof;

public class UITesting extends BaseTest{
    private String BrowserType;
    public UITesting(String name, int id , String BrowserType ){
        super(name , id);
        this.BrowserType = BrowserType;
    }

    public String getBrowserType() {
        return BrowserType;
    }

    public void setBrowserType(String browserType) {
        BrowserType = browserType;
    }
}
