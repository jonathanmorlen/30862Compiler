import java.io.IOException;

public class CmpeOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException
    {
        Writer.writeInstruction(132);
    }
}