import java.io.IOException;

public class AddOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException
    {
        Main.outputFile.write((byte) 100);
    }
}