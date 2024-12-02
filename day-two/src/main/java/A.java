import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class A {
    static List<List<Integer>>getInputFromFile(String filename){
        List<List<Integer>> input = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get("day-two/" + filename));
            for (String line : lines) {
                List<Integer> temp = new ArrayList<>();
                String[] arr = line.split(" ");
                for(String number : arr){
                    temp.add(Integer.parseInt(number));
                }
                input.add(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to get file");
            return new ArrayList<>();
        }
        return input;
    }
    public static void main(String[] args) {
        var input = getInputFromFile("test.txt");
        for(List<Integer> li : input){
            System.out.println(li);
        }
        int countOfSafeReports = 0;
        for(List<Integer> report : input){
            Boolean isDecremental = true; // list is 9 8 7 6 5
            Boolean isIncremental = true; // list is 1 2 3 4 5
            for(int i = 0; i < report.size() - 1; i++){
                int current = report.get(i);
                int next = report.get(i+1);
                int diff = current - next;
                if(diff > 0 && diff <= 3 && isDecremental) {
                    isIncremental = false;
                }else if(diff < 0 && diff >= -3 && isIncremental){
                    isDecremental = false;
                }else{
                    isDecremental = false;
                    isIncremental = false;
                    break;
                }
            }
            if(isDecremental || isIncremental){
                countOfSafeReports++;
            }
        }
        System.out.println(countOfSafeReports);
    }
}
