package framework;

import org.openqa.selenium.WebDriver;

public class PageBase {
    Browser oBrowser;

    public PageBase(Browser pBrow){
        oBrowser = pBrow;
    }

    public WebDriver driver(){
        return oBrowser.oDriver;
    }

}
