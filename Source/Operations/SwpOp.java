import java.io.IOException;

public class SwpOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException
    {
        Writer.writeInstruction(94);
    }
}