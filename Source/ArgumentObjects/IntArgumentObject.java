import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class IntArgumentObject extends ArgumentObject
{
    private int integer;
    public IntArgumentObject(int i)
    {
        integer = i;
    }

    public int getInteger()
    {
        return integer;
    }
}
