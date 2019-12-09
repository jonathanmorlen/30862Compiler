import java.awt.image.DataBufferByte;
import java.io.IOException;
import java.nio.ByteBuffer;

public class RetOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException {
        System.out.println("Generating code for RetOp...");

        // Pushi 0 instruction
        Main.outputFile.write((byte) 70);
        Main.outputFile.write((byte) 0);

        // Popa instruction
        Main.outputFile.write((byte) 77);

        // Ret instruction
        Main.outputFile.write((byte) 48);
    }
}