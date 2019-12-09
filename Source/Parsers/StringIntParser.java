public class StringIntParser implements IParser
{
    public ArgumentObject parse(String[] arguments)
    {
        SymbolTable.addValue(arguments[1], Integer.parseInt(arguments[2]));
        return new IntStringArgumentObject(Integer.parseInt(arguments[2]), arguments[1]);
    }
}
