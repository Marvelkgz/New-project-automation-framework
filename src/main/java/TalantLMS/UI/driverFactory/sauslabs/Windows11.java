package TalantLMS.UI.driverFactory.sauslabs;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Windows11 {

    public static RemoteWebDriver ChromeDriver() {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "selenium-build-4IT7S");
        browserOptions.setCapability("name", "<your test name>");
        browserOptions.setCapability("sauce:options", sauceOptions);

        RemoteWebDriver driver = null;
        try {
            URL url = new URL("https://oauth-msc.mars92-7e9e2:1ee8d4fb-7f8a-419d-91e8-6d07e3ddd665@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
            driver = new RemoteWebDriver(url, browserOptions);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return driver;
    }

}
