package TalantLMS.UI.driverFactory.sauslabs;

import TalantLMS.UI.driverFactory.Driver;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Windows10 {
    public static RemoteWebDriver windows10Driver()throws MalformedURLException {
        FirefoxOptions browserOptions = new FirefoxOptions();
        browserOptions.setPlatformName("Windows 10");
        browserOptions.setBrowserVersion("latest");
        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("build", "<your build id>");
        sauceOptions.put("name", "<your test name>");
        browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://oauth-msc.mars92-7e9e2:1ee8d4fb-7f8a-419d-91e8-6d07e3ddd665@ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
    return driver;
    }
    @Test
    public void test(){
        Driver.getDriver().get("https://www.imoving.com/");
    }
}
