package framework.ui;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {
    public WebDriver oDriver;
    String sBrow;
    String sInitUrl;

    public Browser(String pBrow, String pURL){
        sBrow = pBrow;
        sInitUrl = pURL;
        this.setDriver();
    }

    //region PROPERTIES

    //endregion

    //region ACTIONS
    public void launch(){
        oDriver.get(sInitUrl);
        oDriver.manage().window().maximize();
    }

    public void close(){
        oDriver.close();
    }
    //endregion

    //region PRIVATE
    private void setDriver(){
        switch (sBrow.toLowerCase()){
            case "chrome":
                System.setProperty("webdriver.chrome.driver",
                        "src/main/resources/webdrivers/chromedriver.exe");
                oDriver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver",
                        "src/main/resources/webdrivers/geckodriver.exe");
                oDriver = new FirefoxDriver();
                break;
            case "safari":
                System.setProperty("webdriver.safari.driver",
                        "src/main/resources/webdrivers/safaridriver.exe");
                oDriver = new SafariDriver();
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver",
                        "src/main/resources/webdrivers/msedgedriver.exe");
                oDriver = new EdgeDriver();
                break;
        }
    }
    //endregion

}
