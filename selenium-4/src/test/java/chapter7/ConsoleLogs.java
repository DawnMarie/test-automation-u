package chapter7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.log.Log;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ConsoleLogs {

    EdgeDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void viewBrowserConsoleLogs() {
        //Get the devtools and create a session
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        //Enable the console logs
        devTools.send(Log.enable());

        //Add a listener for the console logs
        devTools.addListener(Log.entryAdded(), logEntry -> {
            System.out.println("-------------");
            System.out.println("Level: " + logEntry.getLevel());
            System.out.println("Text: " + logEntry.getText());
            System.out.println("Broken URL: " + logEntry.getUrl());
        });

        //Load the AUT
        driver.get("https://the-internet.herokuapp.com/broken_images");
    }
}
