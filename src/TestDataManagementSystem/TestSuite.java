package TestDataManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {
    List<TestData> tests;

    public  TestSuite(){
        tests = new ArrayList<>();
    }

    public void addTest(TestData test){
        tests.add(test);
    }

    public void printAllTests(){
        if (tests.isEmpty()){
            System.out.println("There is not test found");
        }
        else
            for (TestData t : tests){
                System.out.println("Test ID :" +t.testId + " Test Name :" + t.testName + " Is automated Test :" + t.isAutomated + " Priority :" + t.priority + " Execution Time :" + t.executionTime);
            }
    }

    public void countStatus(String status){

    }
}
