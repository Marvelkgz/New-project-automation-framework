package stepDefs;

import TalantLMS.UI.driverFactory.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
    public void tearDawn(Scenario scenario){
      try{
          if (scenario.isFailed()){
              final byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
         scenario.attach(screenshot,"image/png","screenshot");
          }
      }catch (Exception e){
          e.printStackTrace();
      }
      Driver.closeDriver();
    }
}
// mvn clean install "-Dcucumber.options= --tags @Smoke"