import amazon.AmazonApp;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestBrowser {
    public static AmazonApp oApp;

    @BeforeAll
    public static void setUp(){
        oApp = new AmazonApp("chrome");
    }

    @Test
    @Order(1)
    public void test_goToAmazon() throws InterruptedException {
        oApp.launch();
        Thread.sleep(2000);
        oApp.close();
    }

    @Test
    @Order(2)
    public void nothing() {

    }
}
