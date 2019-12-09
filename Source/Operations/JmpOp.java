import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class JmpOp implements IOperation
{
    private IParser parser = new StringParser();

    public void generateCode(String[] arguments) throws IOException
    {
        if(!Main.firstRun)
        {
            ArgumentObject argumentObject = parser.parse(arguments);
            int location = SymbolTable.getValueAt(argumentObject.getString());
            Writer.pushi(location);
            Writer.writeInstruction(36);
        }
        else
        {
            Writer.pushi(0);
            Writer.writeInstruction(40);
        }
    }
}