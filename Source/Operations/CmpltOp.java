import java.io.IOException;

public class CmpltOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException
    {
        Writer.writeInstruction(136);
    }
}