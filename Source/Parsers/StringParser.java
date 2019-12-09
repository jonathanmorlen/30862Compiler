public class StringParser implements IParser
{
    public ArgumentObject parse(String[] arguments)
    {
        return new StringArgumentObject(arguments[1]);
    }
}
