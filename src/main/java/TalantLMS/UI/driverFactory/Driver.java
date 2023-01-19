package TalantLMS.UI.driverFactory;

import TalantLMS.UI.dataProvider.ConfigReader;
import TalantLMS.UI.driverFactory.sauslabs.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;

public class Driver {

    private Driver(){
        //Singleton pattern
    }

    private static WebDriver driver;

    public static WebDriver getDriver(){
      if (driver == null){
          switch (ConfigReader.getProperty("browser").toLowerCase().trim()){
              case "chrome":
                  driver = ChromeWebDriver.loadChromeDriver();
              break;
                  case "firefox":
                      try {
                          driver = Windows10.windows10Driver();
                      }catch (MalformedURLException e){
                          e.printStackTrace();
                      }
              case "edge":
                  driver = EdgeWebDriver.loadEdgeDriver();
                  break;
              case "safari":
                  try{
                      driver = OSXYosem.OSXYoseme();
                  }catch (MalformedURLException e){
                      e.printStackTrace();
                  }
                  break;
              default:
                  driver = ChromeWebDriver.loadChromeDriver();
          }
      }
        return driver;
    }

    public static void closeDriver(){
        try{
            if (driver != null){
                driver.close();
                driver.quit();
                driver = null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
