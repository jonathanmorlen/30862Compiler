public class IntStringParser implements IParser
{
    public ArgumentObject parse(String[] arguments)
    {
        SymbolTable.addValue(arguments[2], Integer.parseInt(arguments[1]));
        return new IntStringArgumentObject(Integer.parseInt(arguments[1]), arguments[2]);
    }
}
