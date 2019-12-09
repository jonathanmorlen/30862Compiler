import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Writer
{
    public static void pushi(int integer) throws IOException
    {
        if(!Main.firstRun)
        {
            Main.outputFile.write((byte) 70);
            Main.outputFile.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(integer).array());
        }
        Main.programCounter += 5;
    }

    public static void writeInstruction(int instructionNumber) throws IOException
    {
        if(!Main.firstRun)
        {
            Main.outputFile.write((byte) instructionNumber);
        }
        Main.programCounter++;
    }
}
