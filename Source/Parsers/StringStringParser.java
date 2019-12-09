public class StringStringParser implements IParser
{
    public ArgumentObject parse(String[] arguments)
    {
        return new StringStringArgumentObject(arguments[1], arguments[2]);
    }
}
