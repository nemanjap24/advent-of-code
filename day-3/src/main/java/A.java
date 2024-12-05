import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
    private static final String PATH = "day-3/src/main/resources/";
    public static void main(String[] args) {
        var input = InputReader.getInputByLine(PATH +"input.txt");
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
