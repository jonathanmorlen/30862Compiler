import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class PopmOp implements IOperation
{
    private IParser parser = new IntParser();

    public void generateCode(String[] arguments) throws IOException {
        ArgumentObject argumentObject = parser.parse(arguments);

        // Push number of entries to pop on stack (pushi)
        Main.outputFile.write((byte) 70);
        Main.outputFile.write(argumentObject.getInteger());
        Main.outputFile.write((byte) 76);
    }
}