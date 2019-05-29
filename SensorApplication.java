import adapters.Adapter;
import adapters.PressureAdapter;
import adapters.RadiationAdapter;
import adapters.TemperatureAdapter;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;


public class SensorApplication extends JFrame {

    public SensorApplication() {
        setTitle("adapters.Adapter Tracker");
        setLayout(new GridLayout(3, 1));

        Adapter pressureAdapter = new PressureAdapter();
        Adapter radiationAdapter = new RadiationAdapter();
        Adapter temperatureAdapter = new TemperatureAdapter();

        createNewPanel(pressureAdapter);
        createNewPanel(radiationAdapter);
        createNewPanel(temperatureAdapter);

        setPreferredSize(new Dimension(600, 600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }

    private void createNewPanel(Adapter adapter) {
        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(adapter.getName()));
        panel.setLayout(new GridLayout(2,1));

        ColorProgressBar bar = new ColorProgressBar(adapter.getBarWidth(), adapter.getStatusColor());
        panel.add(bar);

        JLabel label = new JLabel(adapter.getStatus() + " --> " + adapter.getValue());
        label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 24));
        panel.add(label);

        add(panel);
    }

    public static void main(String[] args) {
        SensorApplication app = new SensorApplication();
    }
}
