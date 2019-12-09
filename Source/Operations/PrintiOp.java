import java.io.IOException;

public class PrintiOp implements IOperation
{
    private IParser parser = new IntParser();

    public void generateCode(String[] arguments) throws IOException {
        ArgumentObject argumentObject = parser.parse(arguments);

        // Pushi instruction
        Main.outputFile.write((byte) 70);
        Main.outputFile.write(argumentObject.getInteger());

        // Print integer instruction
        Main.outputFile.write((byte) 146);
    }
}