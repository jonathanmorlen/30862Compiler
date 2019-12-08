public class IntParser implements IParser
{
    public ArgumentObject parse(String[] arguments)
    {
        return new IntArgumentObject(Integer.parseInt(arguments[1]));
    }
}
