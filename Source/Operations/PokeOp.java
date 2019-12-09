import java.io.IOException;

public class PokeOp implements IOperation
{
    private IParser parser = new IntStringParser();
    public void generateCode(String[] arguments) throws IOException
    {
        ArgumentObject argumentObject = parser.parse(arguments);
        Writer.pushi(SymbolTable.getValueAt(argumentObject.getString()));
        Writer.pushi(argumentObject.getInteger());
        Writer.writeInstruction(90);
    }
}