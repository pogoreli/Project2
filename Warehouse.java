import java.awt.Graphics;

/**
 * A class for storing the information about a warehouse
 *
 * @Ivan Pogorelov
 * @10/20/2021
 */
public class Warehouse implements Schedule, Render
{
    CommonVariables cv = new CommonVariables();
    Location location = new Location();
    
    /**
     *  Called each hour, allowing the object to perform an action.
     */
    public void action()
    {
        
    }
    
    /**
     * Will store the object’s current information into a log file.
     */
    public int log_status()
    {
        Logger logger = new Logger(cv.pathToTheLogFile);
        logger.save("Current status of a warehouse");
        return 0;
    }
    
    public void draw(Graphics g)
    {
        
    }
}
