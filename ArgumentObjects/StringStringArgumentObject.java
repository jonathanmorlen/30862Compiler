public class StringStringArgumentObject extends ArgumentObject
{
    private String string1;
    private String string2;
    StringStringArgumentObject(String s1, String s2)
    {
        string1 = s1;
        string2 = s2;
    }

    public String getString1()
    {
        return string1;
    }

    public String getString2()
    {
        return string2;
    }
}
