import java.nio.ByteBuffer;
import java.nio.ByteOrder;

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
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        return buffer.putInt(integer).array();
    }
}
