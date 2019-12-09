import java.io.*;

public class Main
{
    public static FileOutputStream outputFile;
    public static int variableCount = 0;
    public static int programCounter = 0;
    public static boolean firstRun;
    public static void main(String[] args)
    {
        try
        {
            outputFile = new FileOutputStream(new File(args[0].replace(".txt", ".bin")));
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        // Open file and parse line by line
        try
        {
            // First run to get all label locations
            firstRun = true;
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            for(String line; (line = reader.readLine()) != null;)
            {
                parseLine(line);
            }

            // Second run to actually compile the file
            programCounter = 0;
            variableCount = 0;
            firstRun = false;
            reader = new BufferedReader(new FileReader(args[0]));
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
            // Get appropriate operation object and write its code to the output binary
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