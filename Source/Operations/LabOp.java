import java.io.IOException;

public class LabOp implements IOperation
{
    private IParser parser = new StringParser();
    public void generateCode(String[] arguments) throws IOException
    {
        ArgumentObject argumentObject = parser.parse(arguments);
        if(Main.firstRun)
        {
            SymbolTable.addValue(argumentObject.getString(), Main.programCounter);
        }
    }
}