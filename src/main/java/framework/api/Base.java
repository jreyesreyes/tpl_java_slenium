package framework.api;

public class Base {
    public Base(){
    }

    private String sBaseUrl;
    public String getBaseUrl(){
        if (sBaseUrl == null)
            //Default value
            sBaseUrl = "";
        return sBaseUrl;
    }
    public void setBaseUrl(String pUrl){
        sBaseUrl = pUrl;
    }
}
