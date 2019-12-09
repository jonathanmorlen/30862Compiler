import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class PushvOp implements IOperation
{
    private IParser parser = new StringParser();

    public void generateCode(String[] arguments) throws IOException {
        ArgumentObject argumentObject = parser.parse(arguments);
        String variableName = argumentObject.getString();
        int location = SymbolTable.getValueAt(variableName);

        // Push location of variable on stack (pushi)
        Main.outputFile.write((byte) 70);
        Main.outputFile.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(location).array());

        // Pushv instruction
        Main.outputFile.write((byte) 74);
    }
}

// Push value of variable onto stack (pushv)