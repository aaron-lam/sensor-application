package adapters;

import sensor.RadiationSensor;

public class RadiationAdapter extends SensorAdapter {

    public RadiationAdapter() {
        RadiationSensor sensor = new RadiationSensor();
        super.value = sensor.getRadiationValue();
        super.status = sensor.getStatusInfo();
        super.name = sensor.getName();
        super.barWidth = (int) (super.value * 10);
    }
}
