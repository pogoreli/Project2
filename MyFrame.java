import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame 
{
    MyPanel panel;
    
    public MyFrame()
    {
        panel = new MyPanel();
        
        setTitle("Interactive map");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        this.add(panel);
        this.pack();
        
        setVisible(true);
    }
}
