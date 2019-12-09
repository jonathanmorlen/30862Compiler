import java.io.IOException;

public class PeekOp implements IOperation
{
    private IParser parser = new StringIntParser();
    public void generateCode(String[] arguments) throws IOException
    {
        ArgumentObject argumentObject = parser.parse(arguments);
        int location = SymbolTable.getValueAt(argumentObject.getString());
        Writer.pushi(location);
        Writer.pushi(argumentObject.getInteger());
        Writer.writeInstruction(86);
    }
}