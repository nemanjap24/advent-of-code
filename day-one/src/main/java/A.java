import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get("src/main/resources/input.txt"));
            for (String line : lines) {
                String[] arr = line.split("   ");
                int first = Integer.parseInt(arr[0]);
                int second = Integer.parseInt(arr[1]);
                firstList.add(first);
                secondList.add(second);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(firstList);
        Collections.sort(secondList);

        int totalDistance = 0;

        for(int i = 0; i < firstList.size(); i++){
            totalDistance += Math.abs(firstList.get(i) - secondList.get(i));
        }

        System.out.println(totalDistance);

    }
}
