package framework;

public class AmazonApp {
    private Browser oBrowser;

    public AmazonApp(String pBrowStr){
        oBrowser = new Browser(pBrowStr, "https://www.amazon.com");
    }

    public void launch(){
        oBrowser.launch();
    }

    public void search(){

    }

    public void close(){
        oBrowser.close();
    }
}
