import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        // Open file and parse line by line
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0])))
        {
            for(String line; (line = reader.readLine()) != null;)
            {
                parseLine(line);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    private static void parseLine(String line) throws Exception
    {
        // If valid operation, parse line
        String[] tokens = line.trim().split(" ");
        if(OperationFactory.getAllOperations().contains(tokens[0]))
        {
            IOperation operation = OperationFactory.getOperation(tokens[0]);
            operation.generateCode(tokens);
        }
        else
        {
            // Print exception in red using ANSI escape codes
            throw new UnsupportedOperationException("\n\u001B[31mOperation not recognized:\n" +
                    String.join(" ", tokens) + "\u001B[0m");
        }
    }
}