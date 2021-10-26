
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public void main()
    {
        MyFrame frame = new MyFrame();
        
        
        int x=0;
        int y=0;
        
        while(true)
        {
            MyPanel panel = new MyPanel();
            panel.set(x,y);
            x++;
            y++;
        }
    }
}
