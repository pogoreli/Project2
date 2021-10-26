import java.util.Scanner;
import java.io.File;

/**
 * Reads a file and returns a string with data
 *
 * @Ivan Pogorelov
 * @10/22/2021
 */
public class FileReader
{
    public String open(String path)
    {
        String input = new String();
        
        try 
         {
             Scanner s = new Scanner(new File(path));
             input = s.nextLine();
         } catch (Exception err)
         {
             System.err.println("Something went wrong while reading a file");
             System.err.println(err);
         }
        return input;
    }
}


