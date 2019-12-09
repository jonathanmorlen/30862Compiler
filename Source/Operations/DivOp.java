import java.io.IOException;

public class DivOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException
    {
        Writer.writeInstruction(112);
    }
}