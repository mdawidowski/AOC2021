package Day3;

import java.io.*;

public class Puzzle1 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("src/main/java/Day3/Day3PuzzleInput.txt");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));

        String firstLine = reader.readLine();
        int[] mostCommonNumber = new int[firstLine.length()];
        for (int i = 0; i < mostCommonNumber.length; i++) {
            mostCommonNumber[i] = Integer.parseInt(String.valueOf(firstLine.charAt(i)));
        }
        String line;
        int numberOfLines = 1;
        while ((line = reader.readLine()) != null) {
            for (int i = 0; i < firstLine.length(); i++) {
                if (line.charAt(i) == '1'){
                    mostCommonNumber[i] += 1;
                }
            }
            numberOfLines++;
        }

        String binaryGammaRate = "", binaryEpsilonRate = "";
        for (int i = 0; i < mostCommonNumber.length; i++) {
            if (mostCommonNumber[i] > numberOfLines/2){
                binaryGammaRate += "1";
                binaryEpsilonRate += "0";
            } else {
                binaryGammaRate += "0";
                binaryEpsilonRate += "1";
            }
        }
        int gammaRate = Integer.parseInt(binaryGammaRate, 2);
        int epsilonRate = Integer.parseInt(binaryEpsilonRate, 2);

        System.out.println(gammaRate*epsilonRate);
    }


}
