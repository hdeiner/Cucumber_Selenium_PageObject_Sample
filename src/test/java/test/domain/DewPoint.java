package test.domain;

public class DewPoint {
    private final String dewPoint;
    private final String dewPointUnits;

    public DewPoint(String dewPoint, String dewPointUnits) {
        this.dewPoint = dewPoint;
        this.dewPointUnits = dewPointUnits;
    }

    public String getDewPoint() {
        return dewPoint;
    }

    public String getDewPointUnits() {
        return dewPointUnits;
    }

    public boolean isUsingStandardUnits() {
        return dewPointUnits.equals("F");
    }
}
