package test;

import test.domain.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CucumberStepdefs {

    private List<String> browsers, applications;

    private Elevation elevation;
    private Temperature temperature;
    private Altimeter altimeter;
    private DewPoint dewPoint;

    @Given("^I'm using the following browsers$")
    public void i_m_using_the_following_browsers(List<String> browsers) {
        this.browsers = browsers;
    }

    @Given("^I'm using the following appplications$")
    public void i_m_using_the_following_appplications(List<String> applications) {
        this.applications = applications;
    }

    @When("^the elevation is \"([^\"]*)\" \"([^\"]*)\"$")
    public void the_elevation_is(String elevation, String elevationUnits) {
        this.elevation = new Elevation(elevation, elevationUnits);
    }

    @When("^the temperature is \"([^\"]*)\" \"([^\"]*)\"$")
    public void the_temperature_is(String temperature, String temperatureUnits) {
        this.temperature = new Temperature(temperature, temperatureUnits);
    }

    @When("^the altimeter is \"([^\"]*)\" \"([^\"]*)\"$")
    public void the_altimeter_is(String altimeter, String altimeterUnits) {
        this.altimeter = new Altimeter(altimeter, altimeterUnits);
    }

    @When("^the dew point is \"([^\"]*)\" \"([^\"]*)\"$")
    public void the_dew_point_is(String dewPoint, String dewPointUnits) {
        this.dewPoint = new DewPoint(dewPoint, dewPointUnits);
    }

    @Then("^the density altitude should be \"([^\"]*)\" \"([^\"]*)\"$")
    public void the_density_altitude_should_be(String densityAltitude, String densityAltitudeUnits) {
        System.out.println();
        for (String browser:browsers) {
            for (String application:applications) {
                DensityAltitudeApplicationTester densityAltitudeApplicationTester = new DensityAltitudeApplicationTester(browser, application, elevation, temperature, altimeter, dewPoint);
                Altitude densityAltitudeResult = densityAltitudeApplicationTester.densityAltitudeResult(densityAltitudeUnits);
                Altitude densityAltitudeExpected = new Altitude(densityAltitude, densityAltitudeUnits);
                assertThat(densityAltitudeResult.toString(), is (densityAltitudeExpected.toString()));
            }
        }
    }
}
