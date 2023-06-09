package BT3_Testcase;

import BT3_Common.BaseTest;

public class TestCase extends BaseTest {
    public void loginCMS(){
        createDriver();
        System.out.println("Navigation to url https://cms.anhtester.com/login");
        System.out.println("Enter email and password");
        System.out.println("Click Login button");
        System.out.println("Verify redirect to Admin page");
    }

    public void addCategory(){
        createDriver();
        System.out.println("Navigation to url https://cms.anhtester.com/login");
        System.out.println("Enter email and password");
        System.out.println("Click Login button");
        System.out.println("Verify redirect to Admin page");

        System.out.println("Click on the Products meny");
        System.out.println("Click on Category menu");
        System.out.println("Click on the Add new category button");
        System.out.println("Enter all fields");
        System.out.println("Click on the Save button");
        System.out.println("Verify add new Category");
        closeDriver();
    }

    public static void main(String[] args) {
        TestCase testcase = new TestCase();
        testcase.loginCMS();

        System.out.println("===========================================");
        testcase.addCategory();

    }
}
