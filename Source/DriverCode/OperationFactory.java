import jdk.dynalink.Operation;

import java.lang.reflect.Constructor;
import java.util.*;

public class OperationFactory
{
    // All possible operations including an empty line
    private static List<String> keys = List.of(
            "//", "decl", "lab", "subr", "ret", "printi", "printv", "jmp", "jmpc", "cmpe", "cmplt", "cmpgt",
            "call", "pushi", "pushv", "popm", "popv", "peek", "poke", "swp", "add", "sub", "mul", "div", ""
    );

    // Names of the class corresponding to the operation
    private static List<String> values = List.of(
            "DoNothing", "DeclOp", "LabOp", "SubrOp", "RetOp", "PrintiOp", "PrintvOp", "JmpOp",
            "JmpcOp", "CmpeOp", "CmpltOp", "CmpgtOp", "CallOp", "PushiOp", "PushvOp", "PopmOp",
            "PopvOp", "PeekOp", "PokeOp", "SwpOp", "AddOp", "SubOp", "MulOp", "DivOp", "DoNothing"
    );

    private static Map<String, IOperation> operations = new HashMap<>();

    // Before using the OperationFactory, create mapping between operation and class with reflection
    static
    {
        for(int i = 0; i < keys.size(); i++)
        {
            try
            {
                Class<?> class_ = Class.forName(values.get(i));
                Constructor<?> constructor_ = class_.getConstructor();
                IOperation operation = (IOperation) constructor_.newInstance();
                operations.put(keys.get(i), operation);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }

    // Returns instance of appropriate operation class based on token
    public static IOperation getOperation(String token) throws Exception {
        IOperation operation = operations.get(token);
        if(operation == null)
        {
            throw new ClassNotFoundException("Unable to get class for \"" + token + "\" operation");
        }
        return operations.get(token);
    }

    public static List<String> getAllOperations()
    {
        return keys;
    }
}
