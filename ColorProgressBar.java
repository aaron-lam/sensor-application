import javax.swing.*;
import java.awt.*;

class ColorProgressBar extends JPanel {

    private int width;
    private Color color;

    public ColorProgressBar(int width, Color color) {
        this.width = width;
        this.color = color;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(0, 10, width * 5, 60);
    }
}
