import java.io.IOException;

public class CmpltOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException
    {
        Main.outputFile.write((byte) 136);
    }
}