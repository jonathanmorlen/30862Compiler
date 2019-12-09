public class StringParser implements IParser
{
    public ArgumentObject parse(String[] arguments)
    {
        System.out.println("Parsing a single string...");
        return new StringArgumentObject(arguments[1]);
    }
}
