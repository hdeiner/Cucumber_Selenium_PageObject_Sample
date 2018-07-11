package test;

import test.domain.*;

import test.domain.Altimeter;
import test.domain.DewPoint;
import test.domain.Elevation;
import test.domain.Temperature;

public class DensityAltitudeApplicationTester {

    private String browser;
    private String application;
    private Elevation elevation;
    private Temperature temperature;
    private Altimeter altimeter;
    private DewPoint dewPoint;

    public DensityAltitudeApplicationTester (String browser, String application, Elevation elevation, Temperature temperature, Altimeter altimeter, DewPoint dewPoint) {
        this.browser = browser;
        this.application = application;
        this.elevation = elevation;
        this.temperature = temperature;
        this.altimeter = altimeter;
        this.dewPoint = dewPoint;
    }

    public Altitude densityAltitudeResult(String densityAltitudeUnits) throws InterruptedException {
        DensityAltitudeApplicationPageFactory densityAltitudeApplicationPageFactory = new DensityAltitudeApplicationPageFactory(browser, application);
        DensityAltitudeApplicationPage densityAltitudeApplicationPage = densityAltitudeApplicationPageFactory.getVariant();

        densityAltitudeApplicationPage.loadPage(browser, application);

        densityAltitudeApplicationPage.setElevation(elevation);
        densityAltitudeApplicationPage.setTemperature(temperature);
        densityAltitudeApplicationPage.setAltimeter(altimeter);
        densityAltitudeApplicationPage.setDewPoint(dewPoint);

        Altitude densityAltitude = densityAltitudeApplicationPage.getDensityAltitude(densityAltitudeUnits);

        densityAltitudeApplicationPage.quit();

//        return new Altitude("1000", "feet");
        return densityAltitude;
    }
}
