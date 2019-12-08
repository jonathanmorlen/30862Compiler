import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<String> operations = List.of(
                "//", "decl", "lab", "subr", "ret", "printc", "prints", "printi", "printf",
                "jmp", "jmpc", "cmpe", "cmplt", "cmpgt", "call", "pushc", "pushs", "pushi",
                "pushf", "popm", "popv", "peek", "poke", "swp", "add", "sub", "mul", "div", ""
        );

        // Open file and parse line by line
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0])))
        {
            for(String line; (line = reader.readLine()) != null;)
            {
                String[] tokens = line.trim().split(" ");
                if(operations.contains(tokens[0]))
                {
                    System.out.println(String.join(" ", tokens));
                }
                else
                {
                    throw new Exception("\n\u001B[31mOperation not recognized:\n" +
                            String.join(" ", tokens) + "\u001B[0m");
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}