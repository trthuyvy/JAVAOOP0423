package BT3_Common;

public class BaseTest {


    public void createDriver(){
        System.out.println("Open Brower: "+Constants.browser);
        System.out.println("Open Report: "+Constants.report);
        System.out.println("Headless Mode: "+Constants.headless);
    }

    public void closeDriver(){
        System.out.println("Closed Brower: "+Constants.browser);
    }

    public void closeDriver(String browser){
        System.out.println("Closed Brower: " + browser);
    }
    public void setBrowser(String browser){
        Constants.browser = browser;
    }
}
