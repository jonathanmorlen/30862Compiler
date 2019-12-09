import java.io.IOException;

public class PushiOp implements IOperation
{
    private IParser parser = new IntParser();

    public void generateCode(String[] arguments) throws IOException {
        ArgumentObject argumentObject = parser.parse(arguments);

        // Push value onto stack (pushi)
        Main.outputFile.write((byte) 70);
        Main.outputFile.write(argumentObject.getInteger());
    }
}