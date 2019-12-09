import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class PopvOp implements IOperation
{
    private IParser parser = new StringParser();
    public void generateCode(String[] arguments) throws IOException
    {
        ArgumentObject argumentObject = parser.parse(arguments);
        int location = SymbolTable.getValueAt(argumentObject.getString());
        Writer.pushi(location);
        Writer.writeInstruction(80);
    }
}