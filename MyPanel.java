import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

/**
 * Panel, which displays the map
 *
 * @Ivan Pogorelov
 * @10/25/2021
 */
public class MyPanel extends JPanel implements ActionListener
{
    final int PANEL_WIDTH = 600;
    final int PANEL_HEIGHT = 600;
    Image truck;
    Image map;
    Timer timer;
    int velocity = 1;
    int x = 0;
    int y = 0;
    CommonVariables cv = new CommonVariables();
    
    public MyPanel()
    {
        this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
        this.setBackground(Color.white);
        truck = new ImageIcon(cv.pathToTruckImage).getImage();
        map = new ImageIcon(cv.pathToMapImage).getImage();
        timer = new Timer(10, this);
        timer.start();
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        g2d.drawImage(map, 0, 0, null);
        g2d.drawImage(truck, x, y, null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(x>PANEL_WIDTH-truck.getWidth(null) || x < 0)
        {
            velocity *= -1;
        }
        x += velocity;
        repaint();
    }
}
