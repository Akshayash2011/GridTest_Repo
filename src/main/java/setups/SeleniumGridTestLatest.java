package setups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SeleniumGridTestLatest {

    public static void main(String[] args) throws MalformedURLException {

        // 1. Chrome Options (Recommended):
        ChromeOptions chromeOptions = new ChromeOptions();
        // chromeOptions.addArguments("--headless=new"); // Example: Run Chrome in headless mode (no visible window) - New Headless argument

        // 2. Hub URL: The address of your Selenium Grid hub
        String hubUrl = "http://192.168.1.10:4444"; // Replace with your hub's URL

        // 3. Create RemoteWebDriver instance
        WebDriver driver = new RemoteWebDriver(new URL(hubUrl), chromeOptions); // Pass ChromeOptions directly

        // 4. Your Test Code:  Interact with the browser as usual
        try {
            driver.get("https://www.google.com");  // Or any website you want to test
            String title = driver.getTitle();
            System.out.println("Title of the page is : " + title);

            // Example: Explicit Wait (Recommended)
            Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Wait up to 10 seconds

            // ... more test steps ...

        } finally {
            // 5. Close the browser session
            if (driver != null) {
                driver.quit(); // Important: Close the browser to release the node
            }
        }
    }
}