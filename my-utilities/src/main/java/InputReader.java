import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class InputReader {
    public static List<String> getInputByLine(String fileLocation){
        List<String> input = new ArrayList<>();
        try{
            input = Files.readAllLines(Paths.get(fileLocation));
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("Failed to open the file");
        }
        return input;
    }
}
