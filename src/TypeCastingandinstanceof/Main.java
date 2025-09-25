package TypeCastingandinstanceof;

public class Main {
    public static void main(String[] args) {
        BaseTest test1 = new APITest("Login ", 1 , "/user");
        BaseTest test2 = new UITesting("Registration", 2, "chrome");

        if (test1 instanceof BaseTest){
            APITest apiTest = (APITest) test1;
            System.out.println(apiTest.getInfo());
        }
        if (test2 instanceof  BaseTest){
            UITesting uiTesting = (UITesting) test2;
            System.out.println(uiTesting.getInfo());
        }
    }
}
