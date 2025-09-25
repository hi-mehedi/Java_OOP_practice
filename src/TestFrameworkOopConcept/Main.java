package TestFrameworkOopConcept;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BaseTest> testSuite = Arrays.asList(
                new UITest("Login Test", "Chrome"),
                new APITest("Get User API", "api/users/")
        );

        for (BaseTest b : testSuite){
            b.executeTest();
        }
    }
}
