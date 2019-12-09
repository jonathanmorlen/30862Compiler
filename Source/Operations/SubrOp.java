import java.io.IOException;

public class SubrOp implements IOperation
{
    private IParser parser = new IntStringParser();
    public void generateCode(String[] arguments) throws IOException
    {
        System.out.println("Generating code for SubrOp...");
        parser.parse(arguments);
    }
}