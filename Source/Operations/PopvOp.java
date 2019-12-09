import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class PopvOp implements IOperation
{
    private IParser parser = new StringParser();
    public void generateCode(String[] arguments) throws IOException
    {
        System.out.println("Generating code for PopvOp...");
        ArgumentObject argumentObject = parser.parse(arguments);
        int location = SymbolTable.getValueAt(argumentObject.getString());

        // Push location of variable to get (pushi)
        Main.outputFile.write((byte) 70);
        Main.outputFile.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(location).array());

        // Popv instruction
        Main.outputFile.write((byte) 80);
    }
}