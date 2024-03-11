package chapter7;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Optional;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.ConnectionType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NetworkConditions {

    EdgeDriver driver;
    DevTools devTools;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        devTools = driver.getDevTools();
    }

    @Test
    public void enableSlowNetwork() {
        devTools.createSession();
        devTools.send(Network.enable(
                Optional.empty(),
                Optional.empty(),
                Optional.empty()));
        devTools.send(Network.emulateNetworkConditions(
                false, 150, 2500, 2000, Optional.of(ConnectionType.CELLULAR3G)));
        driver.get("https://dawn-marie.dev");
        System.out.println("Enable Slow Network: " + driver.getTitle());
    }

    @Test
    public void doNotEnableSlowNetwork() {
        driver.get("https://dawn-marie.dev");
        System.out.println("Do Not Enable Network: " + driver.getTitle());
    }

}
