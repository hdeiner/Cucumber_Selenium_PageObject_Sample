package test.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import test.domain.*;

public class DensityAltitudeApplicationPage_Firefox_PilotFriend implements DensityAltitudeApplicationPage {
    private WebDriver driver = null;

    public void load() {
        System.setProperty("webdriver.gecko.driver", "lib/geckodriver");
        driver = new FirefoxDriver();
        driver.get("http://www.pilotfriend.com/flightplanning/flight%20planning/calculators/density_altitude_calc.htm");
    }

    public void setElevation(Elevation elevation) {
        driver.findElement(By.name("elevation")).sendKeys(elevation.getElevation());
        if (elevation.isUsingStandardUnits()) {
            driver.findElements(By.name("in_elev")).get(0).click();
        } else {
            driver.findElements(By.name("in_elev")).get(1).click();
        }
    }

    public void setTemperature(Temperature temperature) {
        driver.findElement(By.name("temperature")).sendKeys(temperature.getTemperature());
        if (temperature.isUsingStandardUnits()) {
            driver.findElements(By.name("in_temp")).get(0).click();
        } else {
            driver.findElements(By.name("in_temp")).get(1).click();
        }
    }

    public void setAltimeter(Altimeter altimeter) {
        driver.findElement(By.name("altset")).sendKeys(altimeter.getAltimeter());
        if (altimeter.isUsingStandardUnits()) {
            driver.findElements(By.name("in_alt_set")).get(0).click();
        } else {
            driver.findElements(By.name("in_alt_set")).get(1).click();
        }
    }

    public void setDewPoint(DewPoint dewPoint) {
        driver.findElement(By.name("dewpoint")).sendKeys(dewPoint.getDewPoint());
        if (dewPoint.isUsingStandardUnits()) {
            driver.findElements(By.name("in_dp")).get(0).click();
        } else {
            driver.findElements(By.name("in_dp")).get(1).click();
        }
    }

    public Altitude getDensityAltitude(String densityAltitudeUnits) {
        Altitude densityAltitude = new Altitude("",densityAltitudeUnits);
        driver.findElement(By.name("e_calculate")).click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until((ExpectedCondition<Boolean>) driver -> driver.findElement(By.name("densaltz")).getAttribute("value").length() != 0);

        if (densityAltitude.isUsingStandardUnits()) {
            densityAltitude = new Altitude(driver.findElement(By.name("densaltz")).getAttribute("value"),densityAltitudeUnits);
        } else {
            densityAltitude = new Altitude(driver.findElement(By.name("densaltzm")).getAttribute("value"),densityAltitudeUnits);
        }
        return densityAltitude;
    }

    public void quit() {
        driver.quit();
    }
}
