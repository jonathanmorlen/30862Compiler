import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class SubrOp implements IOperation
{
    private IParser parser = new IntStringParser();
    public void generateCode(String[] arguments) throws IOException
    {
        ArgumentObject argumentObject = parser.parse(arguments);

        // Push return address
        Main.outputFile.write((byte) 70);
        Main.outputFile.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(16).array());

        // Push main address
        Main.outputFile.write((byte) 70);
        Main.outputFile.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(17).array());

        // Push zero to call function with 1 argument
        Main.outputFile.write((byte) 70);
        Main.outputFile.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(1).array());

        // Call instruction
        Main.outputFile.write((byte) 44);

        // Return address
        Main.outputFile.write((byte) 0);
    }
}