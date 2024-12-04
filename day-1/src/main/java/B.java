import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class B {
    static final String FILENAME = "test.txt";
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get("day-one/" + FILENAME));
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
        Map<Integer,Integer> map = new HashMap<>();
        for(int key : secondList){
            // init map
            // if not exist key = key, val = 1
            // if key exist val++
            if(!map.containsKey(key)){
                map.put(key,1);
            }
            else{
//                map.get(key)
                map.put(key, map.get(key)+1);
            }
        }
        int totalDistance = 0;

        for(int n : firstList){
            try{
                totalDistance+= n * map.get(n);
            } catch(Exception e){
            }
        }


        System.out.println(totalDistance);

    }
}
