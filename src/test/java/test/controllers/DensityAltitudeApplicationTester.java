package test.controllers;

import test.domain.*;
import test.pageObjects.DensityAltitudeApplicationPage;
import test.pageObjects.DensityAltitudeApplicationPageFactory;

public class DensityAltitudeApplicationTester {

    private final String browser;
    private final String application;
    private final Elevation elevation;
    private final Temperature temperature;
    private final Altimeter altimeter;
    private final DewPoint dewPoint;

    public DensityAltitudeApplicationTester (String browser, String application, Elevation elevation, Temperature temperature, Altimeter altimeter, DewPoint dewPoint) {
        this.browser = browser;
        this.application = application;
        this.elevation = elevation;
        this.temperature = temperature;
        this.altimeter = altimeter;
        this.dewPoint = dewPoint;
    }

    public Altitude densityAltitudeResult(String densityAltitudeUnits) {
        DensityAltitudeApplicationPageFactory densityAltitudeApplicationPageFactory = new DensityAltitudeApplicationPageFactory(browser, application);
        DensityAltitudeApplicationPage densityAltitudeApplicationPage = densityAltitudeApplicationPageFactory.getVariant();

        densityAltitudeApplicationPage.load();

        densityAltitudeApplicationPage.setElevation(elevation);
        densityAltitudeApplicationPage.setTemperature(temperature);
        densityAltitudeApplicationPage.setAltimeter(altimeter);
        densityAltitudeApplicationPage.setDewPoint(dewPoint);

        Altitude densityAltitude = densityAltitudeApplicationPage.getDensityAltitude(densityAltitudeUnits);

        densityAltitudeApplicationPage.quit();

        return densityAltitude;
    }
}
