import java.util.HashMap;
import java.util.Map;

public class SymbolTable
{
    private static Map<String, Integer> symbolTable = new HashMap<>();
    public static int getValueAt(String key)
    {
        return symbolTable.get(key);
    }
    public static void addValue(String key, int value)
    {
        symbolTable.put(key, value);
    }
}
