import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        // Open file and read line by line
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0])))
        {
            for(String line; (line = reader.readLine()) != null;)
            {
                System.out.println(line);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}