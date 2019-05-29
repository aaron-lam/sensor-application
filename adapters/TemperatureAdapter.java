package adapters;

import sensor.TemperatureSensor;

public class TemperatureAdapter extends SensorAdapter {

    public TemperatureAdapter() {
        TemperatureSensor sensor = new TemperatureSensor();
        super.value = sensor.senseTemperature();
        super.status = sensor.getTempReport();
        super.name = sensor.getSensorType();
        super.barWidth = (int) (super.value / 5);
    }
}
