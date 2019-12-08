public class StringArgumentObject extends ArgumentObject
{
    private String string;
    StringArgumentObject(String s)
    {
        string = s;
    }

    public String getString()
    {
        return string;
    }
}
