package Day1;

import java.io.*;

public class Puzzle2 {

    public static void main(String[] args) throws IOException {
        File inputFile = new File("src/main/java/Day1/Day1PuzzleInput.txt");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        String firstNumber = reader.readLine();
        String secondNumber = reader.readLine();
        String thirdNumber = reader.readLine();
        String nextNumber;
        int sumOfThreeNumbers = Integer.valueOf(firstNumber) + Integer.valueOf(secondNumber) + Integer.valueOf(thirdNumber);
        int sumOfNextThreeNumbers = Integer.valueOf(secondNumber) + Integer.valueOf(thirdNumber);
        int numberOfIncreases = 0;
        while((nextNumber = reader.readLine()) != null) {
            sumOfNextThreeNumbers += Integer.valueOf(nextNumber);
            if (sumOfNextThreeNumbers > sumOfThreeNumbers){
                numberOfIncreases++;
            }
            sumOfThreeNumbers = sumOfNextThreeNumbers;
            sumOfNextThreeNumbers -= Integer.valueOf(secondNumber);
            secondNumber = thirdNumber;
            thirdNumber = nextNumber;

        }
        System.out.println("numberOfIncreases = " + numberOfIncreases);
    }
}
