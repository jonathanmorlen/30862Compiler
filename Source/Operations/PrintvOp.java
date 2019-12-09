import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class PrintvOp implements IOperation
{
    private IParser parser = new StringParser();
    public void generateCode(String[] arguments) throws IOException
    {
        ArgumentObject argumentObject = parser.parse(arguments);
        int location = SymbolTable.getValueAt(argumentObject.getString());

        // Push variable location onto stack (pushi)
        Main.outputFile.write((byte) 70);
        Main.outputFile.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(location).array());

        // Push value of variable onto stack (pushv)
        Main.outputFile.write((byte) 74);

        // Print variable value from top of stack (printi)
        Main.outputFile.write((byte) 146);
    }
}