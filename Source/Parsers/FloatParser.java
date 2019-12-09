public class FloatParser implements IParser
{
    public ArgumentObject parse(String[] arguments)
    {
        System.out.println("Parsing a float...");
        return new FloatArgumentObject(Float.parseFloat(arguments[1]));
    }
}
