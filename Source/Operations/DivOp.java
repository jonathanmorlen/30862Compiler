import java.io.IOException;

public class DivOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException
    {
        Main.outputFile.write((byte) 112);
    }
}