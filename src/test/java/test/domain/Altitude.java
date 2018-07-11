package test.domain;

public class Altitude {
    String altitude;
    String altitudeUnits;

    public Altitude(String altitude, String altitudeUnits) {
        this.altitude = altitude;
        this.altitudeUnits = altitudeUnits;
    }

    public boolean isUsingStandardUnits() {
        return altitudeUnits.equals("feet");
    }

    @Override
    public String toString() {
        return altitude + " " + altitudeUnits;
    }
}
