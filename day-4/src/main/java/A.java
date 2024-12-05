import java.util.ArrayList;
import java.util.List;

public class A {

    final static char[] XMAS = {'X','M','A','S'};

    public static void main(String[] args) {
        var leftRight = InputReader.getInputByLine("day-4/src/main/resources/test.txt");
        var rightLeft = leftRight.reversed(); // popraviti
        var topBottom = transposeMatrix(leftRight);
        var bottomTop = topBottom.reversed(); // popraviti

        var leftBottomDiag = rotateMatrixLB(leftRight);
        var bottomLeftDiag = leftBottomDiag.reversed();

        var rightToBottomDiag = rotateMatrixRB(leftRight);
        var rightBottomReverseDiag = rightToBottomDiag.reversed();


        for (var line : leftRight){
            System.out.println(line);
        }
        System.out.println();
        for(var line : rightLeft){
            System.out.println(line);
        }


        // left to right, findstr
        // right to left,
        // top to bottom,
        // bottom to top,
        // diagonal x 4








        // 8 for loops
        // every checking its own direction
        // left to right, x
        // right to left, x
        // top to bottom,
        // bottom to top,
        // diagonal x 4
//        char[][] inputArr = new char[input.size()][];
//
//        for(int i = 0; i < input.size(); i++){
//            char[] temp = input.get(i).toCharArray();
//            inputArr[i] = temp;
//        }
//
//        int countOfXMAS = 0;
//
//        for (int i = 0; i < inputArr.length; i++) {
//            int counterLR = 0;
//            int counterRL = 0;
//            for (int j = 0; j < inputArr[0].length; j++) {
//                if(inputArr[i][j] == XMAS[0]) counterLR = 0;
//                if(inputArr[i][j] == XMAS[counterLR]){
//                    if(counterLR == 3){
//                        counterLR = 0;
//                        countOfXMAS++;
//                    }else{
//                        counterLR++;
//                    }
//                }else{
//                    counterLR = 0;
//                }
//                if(inputArr[i][j] == XMAS[3]) counterRL = 0;
//                if(inputArr[i][j] == XMAS[3-counterRL]){
//                    if(counterRL == 3){
//                        counterRL = 0;
//                        countOfXMAS++;
//                    }
//                    else{
//                        counterRL++;
//                    }
//                }else{
//                    counterRL = 0;
//                }
//            }
//        }
//        System.out.println(countOfXMAS);
    }

    private static List<String> rotateMatrixRB(List<String> leftRight) {
        return new ArrayList<>();
    }

    private static List<String> rotateMatrixLB(List<String> leftRight) {
        return new ArrayList<>();
    }

    private static List<String> transposeMatrix(List<String> input) {
        return new ArrayList<>();
    }
}