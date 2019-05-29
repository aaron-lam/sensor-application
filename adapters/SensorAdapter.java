package adapters;

import java.awt.*;

public class SensorAdapter implements Adapter {

    protected String status;
    protected double value;
    protected String name;
    protected int barWidth;

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Color getStatusColor() {
        switch (status) {
            case "OK":
                return Color.GREEN;
            case "CRITICAL":
                return Color.YELLOW;
            case "DANGER":
                return Color.RED;
            default:
                return Color.WHITE;
        }
    }

    @Override
    public int getBarWidth() {
        return barWidth;
    }
}
