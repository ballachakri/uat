
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DemoTest3 {

    @Before
    public void demoTest3Before() {
        System.out.println("This a before method in demoTest3  Before method...................");
    }

    @Test
    public void demoTest3Test() {
        System.out.println("Demo Test 3 test method executed.......................... ");
        System.out.println("User Acceptance Test Successfully Passed");
    }

    @After
    public void demoTest3After() {
        System.out.println("This a before method in demoTest3Before method...................");
    }

}
