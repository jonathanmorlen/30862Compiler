import java.nio.ByteBuffer;

public class IntStringArgumentObject extends ArgumentObject
{
    private int integer;
    private String string;
    IntStringArgumentObject(int i, String s)
    {
        integer = i;
        string = s;
    }

    public int getInteger()
    {
        return integer;
    }

    public String getString()
    {
        return string;
    }
}
