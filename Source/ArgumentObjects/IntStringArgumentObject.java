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

    public byte[] getInteger()
    {
        ByteBuffer buffer = ByteBuffer.allocate(4);
        return buffer.putInt(integer).array();
    }

    public String getString()
    {
        return string;
    }
}
