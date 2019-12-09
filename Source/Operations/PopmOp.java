import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class PopmOp implements IOperation
{
    private IParser parser = new IntParser();

    public void generateCode(String[] arguments) throws IOException {
        ArgumentObject argumentObject = parser.parse(arguments);
        Writer.pushi(argumentObject.getInteger());
        Writer.writeInstruction(76);
    }
}