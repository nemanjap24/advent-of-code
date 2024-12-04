import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
    static List<String> getInput(String filename){
        List<String> input = new ArrayList<>();
        try{
            input = Files.readAllLines(Paths.get("day-3/" + filename));
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("Failed to open the file");
        }
        return input;
    }
    public static void main(String[] args) {
        var input = getInput("input.txt");
        List<String> parsed = new ArrayList<>();
        String regex = "mul\\(\\d{1,3},\\d{1,3}\\)";
        String regexForParsingNumbers = "\\d{1,3}";
        Pattern stringPattern = Pattern.compile(regex);
        Pattern numberPattern = Pattern.compile(regexForParsingNumbers);
        Matcher matcher = stringPattern.matcher(input.toString());

        int sum = 0;
        while(matcher.find()){
            String string = matcher.group();
            Matcher numberMatcher = numberPattern.matcher(string);
            int mul = 1;
            while(numberMatcher.find()){
                mul *= Integer.parseInt(numberMatcher.group());
            }
            sum+=mul;
            parsed.add(string);
        }
        System.out.println(sum);

    }
}
