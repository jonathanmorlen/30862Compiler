import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class DeclOp implements IOperation
{
    private static int variableCount = 0;
    private IParser parser = new StringStringParser();
    public void generateCode(String[] arguments) throws IOException
    {
        ArgumentObject argumentObject = parser.parse(arguments);
        SymbolTable.addValue(argumentObject.getString1(), variableCount++);
        Writer.pushi(0);
    }
}