import java.awt.Graphics;

/**
 * A class for storing the information about a truck
 *
 * @Ivan Pogorelov
 * @10/20/2021
 */
public class Truck implements Schedule, Render
{
    CommonVariables cv = new CommonVariables();
    String name;
    private Location location = new Location();
    int numLoads;
    int speed;
    
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
        logger.save("Current status of a truck");
        return 0;
    }
    
    public void draw(Graphics g)
    {
        
    }
    
    /**
     * For debugging only
     */
    public void printName()
    {
        System.out.println(name + " " + numLoads + " " + speed);
    }
}
