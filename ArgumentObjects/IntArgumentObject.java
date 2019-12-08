import java.nio.ByteBuffer;

public class IntArgumentObject extends ArgumentObject
{
    private int integer;
    public IntArgumentObject(int i)
    {
        integer = i;
    }

    public byte[] getInteger()
    {
        ByteBuffer buffer = ByteBuffer.allocate(4);
        return buffer.putInt(integer).array();
    }
}
