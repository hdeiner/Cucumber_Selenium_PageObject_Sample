package test;

import test.domain.*;

class DensityAltitudeApplicationTester {

    private final String browser;
    private final String application;
    private final Elevation elevation;
    private final Temperature temperature;
    private final Altimeter altimeter;
    private final DewPoint dewPoint;

    DensityAltitudeApplicationTester (String browser, String application, Elevation elevation, Temperature temperature, Altimeter altimeter, DewPoint dewPoint) {
        this.browser = browser;
        this.application = application;
        this.elevation = elevation;
        this.temperature = temperature;
        this.altimeter = altimeter;
        this.dewPoint = dewPoint;
    }

    Altitude densityAltitudeResult(String densityAltitudeUnits) {
        DensityAltitudeApplicationPageFactory densityAltitudeApplicationPageFactory = new DensityAltitudeApplicationPageFactory(browser, application);
        DensityAltitudeApplicationPage densityAltitudeApplicationPage = densityAltitudeApplicationPageFactory.getVariant();

        densityAltitudeApplicationPage.loadPage();

        densityAltitudeApplicationPage.setElevation(elevation);
        densityAltitudeApplicationPage.setTemperature(temperature);
        densityAltitudeApplicationPage.setAltimeter(altimeter);
        densityAltitudeApplicationPage.setDewPoint(dewPoint);

        Altitude densityAltitude = densityAltitudeApplicationPage.getDensityAltitude(densityAltitudeUnits);

        densityAltitudeApplicationPage.quit();

        return densityAltitude;
    }
}
