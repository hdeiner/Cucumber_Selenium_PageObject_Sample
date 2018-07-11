package test.domain;

public class Elevation {
    String elevation;
    String elevationUnits;

    public Elevation(String elevation, String elevationUnits) {
        this.elevation = elevation;
        this.elevationUnits = elevationUnits;
    }

    public String getElevation() {
        return elevation;
    }

    public String getElevationUnits() {
        return elevationUnits;
    }

    public boolean isUsingStandardUnits() {
        return elevationUnits.equals("feet");
    }
}