package test.domain;

public class Temperature {
    String temperature;
    String temperatureUnits;

    public Temperature(String temperature, String temperatureUnits) {
        this.temperature = temperature;
        this.temperatureUnits = temperatureUnits;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getTemperatureUnits() {
        return temperatureUnits;
    }

    public boolean isUsingStandardUnits() {
        return temperatureUnits.equals("F");
    }
}
