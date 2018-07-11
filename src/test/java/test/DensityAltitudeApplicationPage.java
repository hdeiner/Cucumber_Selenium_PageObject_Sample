package test;

import test.domain.*;

public interface DensityAltitudeApplicationPage {
    void loadPage(String browser, String application);
    void setElevation(Elevation elevation);
    void setTemperature(Temperature temperature);
    void setAltimeter(Altimeter altimeter);
    void setDewPoint(DewPoint dewPoint);
    Altitude getDensityAltitude(String densityAltitudeUnits);
    void quit();
}
