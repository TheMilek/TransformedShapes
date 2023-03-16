import javax.swing.JFrame;
import java.awt.*;
public class TransformedShapes extends JFrame {

    private TransformedShapes() {
        setTitle("Z letter");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        var g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(10));

        g2.setColor(Color.RED);
        g2.fillRect(50, 50, 300, 20);
        g2.fillRect(50, 310, 300, 20);
        g2.rotate(Math.toRadians(140), 200, 200);
        g2.translate(-25, -10);
        g2.fillRect(30, 210, 380, 20);
    }

    public static void main(String[] args) {
        new TransformedShapes();
    }
}