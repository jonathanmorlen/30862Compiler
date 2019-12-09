import java.io.IOException;

public class CmpeOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException
    {
        Main.outputFile.write((byte) 132);
    }
}