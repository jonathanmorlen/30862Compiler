import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class RetOp implements IOperation
{
    public void generateCode(String[] arguments) throws IOException
    {
        Writer.pushi(0);
        Writer.writeInstruction(77);
        Writer.writeInstruction(48);
    }
}