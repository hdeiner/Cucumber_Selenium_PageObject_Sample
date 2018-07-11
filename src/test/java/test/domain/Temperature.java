package test.domain;

public class Temperature {
    private final String temperature;
    private final String temperatureUnits;

    public Temperature(String temperature, String temperatureUnits) {
        this.temperature = temperature;
        this.temperatureUnits = temperatureUnits;
    }

    public String getTemperature() {
        return temperature;
    }

    public boolean isUsingStandardUnits() {
        return temperatureUnits.equals("F");
    }
}
