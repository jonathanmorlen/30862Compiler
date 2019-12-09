import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class SubrOp implements IOperation
{
    private IParser parser = new IntStringParser();
    public void generateCode(String[] arguments) throws IOException
    {
        ArgumentObject argumentObject = parser.parse(arguments);

        // Set up main function and return address
        Writer.pushi(16);
        Writer.pushi(17);
        Writer.pushi(1);
        Writer.writeInstruction(44);
        Writer.writeInstruction(0);
    }
}