public class StringStringParser implements IParser
{
    public ArgumentObject parse(String[] arguments)
    {
        System.out.println("Parsing double strings...");
        return new StringStringArgumentObject(arguments[1], arguments[2]);
    }
}
