import java.awt.*;
import java.awt.event.*;

public class GraphicsHouse extends Canvas {
    private Color doorColor = Color.BLUE;


    public GraphicsHouse() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (e.getX() >= 170 && e.getX() <= 230 && e.getY() >= 270 && e.getY() <= 350) {
                    doorColor = (doorColor == Color.BLUE) ? Color.RED : Color.BLUE;
                    repaint(); 
                }
            }
        });
    }

    @Override
    public void paint(Graphics g) {

        g.setColor(Color.YELLOW);
        g.fillRect(100, 200, 200, 150);


        g.setColor(Color.RED);
        int[] xPoints = {80, 200, 320};
        int[] yPoints = {200, 100, 200};
        g.fillPolygon(xPoints, yPoints, 3);


        g.setColor(doorColor);
        g.fillRect(170, 270, 60, 80); 
    }

    public static void main(String[] args) {

        Frame frame = new Frame("House Drawing");
        GraphicsHouse canvas = new GraphicsHouse(); 
        frame.add(canvas); 
        frame.setSize(400, 400);
        frame.setVisible(true); 


        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}

