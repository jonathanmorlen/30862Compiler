import java.io.IOException;

public class SubOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException
    {
        Writer.writeInstruction(104);
    }
}