
/**
 * A class for storing 2 dimentional location of an object
 *
 * @Ivan Pogorelov
 * @10/21/2021
 */
public class Location
{
    Double x = 0d;
    Double y = 0d;
    
    public Location()
    {
        
    }
    
    public Location(Double X, Double Y)
    {
        x = X;
        y = Y;
    }
    
    /**
     * Updates the location of the current object
     */
    public void moveToward(Location endLocation, int speed)
    {
        Location current = new Location(x, y);
        Location newLocation = findNewLocation(current, endLocation, speed);
        x = newLocation.x;
        y = newLocation.y;
    }
    
    /**
     * Finds the new location in one hour
     */
    public Location findNewLocation(Location inicial, Location terminal, int speed)
    {
        if(inicial == terminal)
        {
            return terminal;
        }
        
        Double distance = distanceBetweenPoints(inicial, terminal);
        
        if(distance<speed)
        {
            return terminal;
        }
        
        Location returnL = new Location();
        Double speedD = Double.valueOf(speed);
        Double k = speedD / distance;
        Double Xnew = inicial.x + (vectorDistance(inicial, terminal).x) * k;
        Double Ynew = inicial.y + (vectorDistance(inicial, terminal).y) * k;
        returnL.x = Xnew;
        returnL.y = Ynew;
        return returnL;
    }
    
    /**
     * Returns a difference between x and y coordinates of two points as a Location object
     */
    public Location vectorDistance(Location inicial, Location terminal)
    {
        Double startX = inicial.x;
        Double startY = inicial.y;
        Double finishX = terminal.x;
        Double finishY = terminal.y;
        
        Double deltaX = finishX - startX;
        Double deltaY = finishY - startY;
        
        return new Location(deltaX, deltaY);
    }
    
    /**
     * Returns distance between two points
     */
    public Double distanceBetweenPoints(Location inicial, Location terminal)
    {
        Location vector = vectorDistance(inicial, terminal);
        Double deltaX = vector.x;
        Double deltaY = vector.y;
        Double distanceBetweenEndPoints = Math.sqrt(Math.pow((deltaX),2)+Math.pow((deltaY),2));
        return distanceBetweenEndPoints;
    }
    
    /**
     * Returns the angle between 2 points in degrees
     */
    public Double angleBetweedEndpoints(Location inicial, Location terminal)
    {
        Location vector = vectorDistance(inicial, terminal);
        Double deltaX = vector.x;
        Double deltaY = vector.y;
        Double hypotenuse = distanceBetweenPoints(inicial, terminal);
        Double sinAlpha = deltaX / hypotenuse;
        Double Alpha = Math.toDegrees(Math.asin(sinAlpha));
        return Alpha;
    }
    
}
