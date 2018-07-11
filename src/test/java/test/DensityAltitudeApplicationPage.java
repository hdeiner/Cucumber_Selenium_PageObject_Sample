package test;

import test.domain.*;

public interface DensityAltitudeApplicationPage {
    public void loadPage(String browser, String application);
    public void setElevation(Elevation elevation);
    public void setTemperature(Temperature temperature);
    public void setAltimeter(Altimeter altimeter);
    public void setDewPoint(DewPoint dewPoint);
    public Altitude getDensityAltitude(String densityAltitudeUnits) throws InterruptedException;
    public void quit();
}
