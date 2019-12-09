import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class SubrOp implements IOperation
{
    private IParser parser = new IntStringParser();
    public void generateCode(String[] arguments) throws IOException
    {
        ArgumentObject argumentObject = parser.parse(arguments);
        SymbolTable.addValue(argumentObject.getString(), ByteBuffer.wrap(argumentObject.getInteger()).getInt());

        // Push return address
        Main.outputFile.write((byte) 70);
        Main.outputFile.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(16).array());

        // Push main address
        Main.outputFile.write((byte) 70);
        Main.outputFile.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(17).array());

        // Push zero to start main with zero arguments
        Main.outputFile.write((byte) 70);
        Main.outputFile.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(0).array());

        // Call instruction
        Main.outputFile.write((byte) 44);

        // Return address
        Main.outputFile.write((byte) 0);
    }
}