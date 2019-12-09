import java.io.IOException;

public class SwpOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException
    {
        Main.outputFile.write((byte) 94);
    }
}