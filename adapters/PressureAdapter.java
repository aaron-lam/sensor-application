package adapters;

import sensor.PressureSensor;

public class PressureAdapter extends SensorAdapter {

    public PressureAdapter() {
        PressureSensor sensor = new PressureSensor();
        super.value = sensor.readValue();
        super.status = sensor.getReport();
        super.name = sensor.getSensorName();
        super.barWidth = (int) super.value * 10;
    }
}
