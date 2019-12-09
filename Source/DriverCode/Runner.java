import java.io.*;

public class Runner
{
    public static void main(String[] args)
    {
        String inputDirectory = "../../Input-Output/CompilerInput/";
        String outputDirectory = "../../Input-Output/CompilerOutput-InterpreterInput/";
        File dir = new File(inputDirectory);
        File[] files = dir.listFiles((dir1, filename) -> filename.endsWith(".txt"));

        assert files != null;
        for (File file :  files)
        {
            String filename = file.getName();
            Main.main(new String[]{inputDirectory + filename});
        }
    }
}
