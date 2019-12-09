import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class RetOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException
    {
        // Pushi 0 instruction
        Main.outputFile.write((byte) 70);
        Main.outputFile.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(0).array());

        // Popa instruction
        Main.outputFile.write((byte) 77);

        // Ret instruction
        Main.outputFile.write((byte) 48);
    }
}