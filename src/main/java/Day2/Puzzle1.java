package Day2;

import java.io.*;

public class Puzzle1 {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("src/main/java/Day2/Day2PuzzleInput.txt");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        int horizontalPosition = 0;
        int depth = 0;
        String input;
        while ((input = reader.readLine())!= null){
            String[] words = input.split("\\s+");
            switch (words[0]){
                case "forward":
                    horizontalPosition += Integer.parseInt(words[1]);
                    break;
                case "up":
                    depth -= Integer.parseInt(words[1]);
                    break;
                case "down":
                    depth += Integer.parseInt(words[1]);
                    break;
            }
        }
        System.out.println(depth*horizontalPosition);
    }
}
