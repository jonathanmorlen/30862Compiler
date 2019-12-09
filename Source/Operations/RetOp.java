import java.awt.image.DataBufferByte;
import java.io.IOException;
import java.nio.ByteBuffer;

public class RetOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException {
        System.out.println("Generating code for RetOp...");
        Main.outputFile.write((byte) 48);
    }
}