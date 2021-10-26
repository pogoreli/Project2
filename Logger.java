import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;

/**
 * A class, which logs a line of text to a file
 *
 * @Ivan Pogorelov
 * @10/20/2021
 */
public class Logger
{
    String path;
    /**
     * Constructor, which takes a path to a log file
     */
    public Logger(String p)
    {
        path = p;
    }
    
    /**
     * Saves all text from the editor as a text file at provided location
     */
    public void save(String lineOfText)
    {
        try
        {
            FileWriter fw = new FileWriter(path, true);
            fw.write(lineOfText + System.lineSeparator());
            fw.close();
            System.err.println("The file is saved succesfully!");
            System.out.println("The file is saved succesfully!");
        }catch(Exception ex1)
        {
            System.err.println("Something went wrong while saving the file");
            System.out.println("Something went wrong while saving the file");
            System.err.println(ex1);
        }
    }
}
