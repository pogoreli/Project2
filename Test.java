
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
    public void main()
    {
        // Location i = new Location(3d,0d);
        // Location f = new Location(0d,5d);
        
        // Location n = i.findNewLocation(i,f,2);
        
        // System.out.print(n.x + " : " + n.y);
        
        // ThreeLoadTruck truck = new ThreeLoadTruck();
        // truck.log_status();
        
        // MyLinkedList<Truck> trucks = new MyLinkedList<Truck>();
        // trucks.add(new ThreeLoadTruck());
        // trucks.add(new OneLoadTruck());
        
        // trucks.get(1).log_status();
        
        // Location i = new Location(-10d,0d);
        // Location f = new Location(0d,20d);
        
        // for(int j=0; j<10; j++)
        // {
            // i.moveToward(f,3);
            // System.out.println(i.x + " : " + i.y);
        // }
        
        MyLinkedList<Truck> t = new MyLinkedList<Truck>();
        
        t.add(new OneLoadTruck("t1")); //0
        t.add(new TwoLoadTruck("t2")); //1
        t.add(new ThreeLoadTruck("t3")); //2
        
        System.out.println(t.size());
        int j = t.size();
        for(int i = 0; i < j; i++)
        {
            t.remove(0).printName();
        }
        
        // for(int i=0; i<0; i++)
        // {
            // System.out.println(1);
        // }
        // System.out.println(2);
        
        
    }
}
