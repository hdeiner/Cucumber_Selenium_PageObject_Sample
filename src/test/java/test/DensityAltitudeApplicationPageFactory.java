package test;

public class DensityAltitudeApplicationPageFactory {
    DensityAltitudeApplicationPage densityAltitudeApplicationPage = null;

    public DensityAltitudeApplicationPageFactory(String browser, String application) {
        if (browser.equals("firefox") && application.equals("Pilot Friend")) {
            densityAltitudeApplicationPage = new DensityAltitudeApplicationPage_Firefox_PilotFriend();
        }
        if (browser.equals("firefox") && application.equals("Shelquist Engineering")) {
            densityAltitudeApplicationPage = new DensityAltitudeApplicationPage_Firefox_ShelquistEngineering();
        }
        if (browser.equals("chrome") && application.equals("Pilot Friend")) {
            densityAltitudeApplicationPage = new DensityAltitudeApplicationPage_Chrome_PilotFriend();
        }
        if (browser.equals("chrome") && application.equals("Shelquist Engineering")) {
            densityAltitudeApplicationPage = new DensityAltitudeApplicationPage_Chrome_ShelquistEngineering();
        }
        if (browser.equals("chromeHeadless") && application.equals("Pilot Friend")) {
            densityAltitudeApplicationPage = new DensityAltitudeApplicationPage_ChromeHeadless_PilotFriend();
        }
        if (browser.equals("chromeHeadless") && application.equals("Shelquist Engineering")) {
            densityAltitudeApplicationPage = new DensityAltitudeApplicationPage_ChromeHeadless_ShelquistEngineering();
        }
    }

    public DensityAltitudeApplicationPage getVariant() {
        return densityAltitudeApplicationPage;
    }
}
