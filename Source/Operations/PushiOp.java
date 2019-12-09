import java.io.IOException;

public class PushiOp implements IOperation
{
    private IParser parser = new IntParser();

    public void generateCode(String[] arguments) throws IOException
    {
        ArgumentObject argumentObject = parser.parse(arguments);
        Writer.pushi(argumentObject.getInteger());
    }
}