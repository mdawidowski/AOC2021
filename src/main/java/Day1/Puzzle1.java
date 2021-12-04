package Day1;

import java.io.*;

public class Puzzle1 {

    public static void main(String[] args) throws IOException {
        File inputFile = new File("src/main/java/Day1/Day1PuzzleInput.txt");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String currentLine;
        String lastLine = reader.readLine();
        int numberOfIncreases = 0;
        while((currentLine = reader.readLine()) != null){
            if (Integer.valueOf(currentLine) > Integer.valueOf(lastLine)){
                numberOfIncreases++;
            }
            lastLine = currentLine;
        }
        System.out.println(numberOfIncreases);
    }
}

