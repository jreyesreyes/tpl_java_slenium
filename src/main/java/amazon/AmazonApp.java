package amazon;

import framework.ui.Browser;

public class AmazonApp {
    private Browser oBrowser;



    public AmazonApp(String pBrowStr){
        oBrowser = new Browser(pBrowStr, getUrl());
    }

    //region PROPERTIES
    private String sUrl;
    public String getUrl(){
        if (sUrl == null)
            sUrl = "https://www.amazon.com";
        return sUrl;
    }
    public void setUrl(String pUrl){
        sUrl = pUrl;
    }
    //endregion

    //region ACTIONS
    public void launch(){
        oBrowser.launch();
    }

    public void search(){

    }

    public void close(){
        oBrowser.close();
    }
    //endregion
}
