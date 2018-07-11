package test.domain;

public class Altimeter {
    private final String altimeter;
    private final String altimeterUnits;

    public Altimeter(String altimeter, String altimeterUnits) {
        this.altimeter = altimeter;
        this.altimeterUnits = altimeterUnits;
    }
    public String getAltimeter() {
        return altimeter;
    }

    public String getAltimeterUnits() {
        return altimeterUnits;
    }

    public boolean isUsingStandardUnits() {
        return altimeterUnits.equals("in Hg");
    }
}
