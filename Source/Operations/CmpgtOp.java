import java.io.IOException;

public class CmpgtOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException
    {
        Main.outputFile.write((byte) 140);
    }
}