import java.io.IOException;

public class AddOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException
    {
        Writer.writeInstruction(100);
    }
}