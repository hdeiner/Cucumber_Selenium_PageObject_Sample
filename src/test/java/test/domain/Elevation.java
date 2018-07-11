package test.domain;

public class Elevation {
    private final String elevation;
    private final String elevationUnits;

    public Elevation(String elevation, String elevationUnits) {
        this.elevation = elevation;
        this.elevationUnits = elevationUnits;
    }

    public String getElevation() {
        return elevation;
    }

    public boolean isUsingStandardUnits() {
        return elevationUnits.equals("feet");
    }
}
