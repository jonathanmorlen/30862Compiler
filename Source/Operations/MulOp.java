import java.io.IOException;

public class MulOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException
    {
        Main.outputFile.write((byte) 108);
    }
}