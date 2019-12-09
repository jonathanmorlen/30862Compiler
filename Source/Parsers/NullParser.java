public class NullParser implements IParser
{
    public ArgumentObject parse(String[] arguments)
    {
        System.out.println("Parsing no arguments...");
        return new NullArgumentObject();
    }
}
