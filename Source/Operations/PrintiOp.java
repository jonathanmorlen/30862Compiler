import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class PrintiOp implements IOperation
{
    private IParser parser = new IntParser();

    public void generateCode(String[] arguments) throws IOException {
        ArgumentObject argumentObject = parser.parse(arguments);

        // Push integer instruction
        Main.outputFile.write((byte) 70);
        Main.outputFile.write(argumentObject.getInteger());

        // Print integer instruction
        Main.outputFile.write((byte) 146);
    }
}