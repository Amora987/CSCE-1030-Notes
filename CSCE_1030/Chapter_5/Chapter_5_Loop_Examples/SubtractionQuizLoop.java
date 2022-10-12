import java.util.Scanner;

public class SubtractionQuizLoop {
    public static void main(String[] args){
        // Number of Questions
        final int NUMBER_OF_QUESTIONS = 5;

        // Number of correct answers
        int correctCount = 0;

        // Count the number of questions
        int count = 0;
        
        long startTime = System.currentTimeMillis();

        // Output string is initially empty
        String output = " ";

        // Create Scanner class
        Scanner input = new Scanner(System.in);

        while(count < NUMBER_OF_QUESTIONS){
            // 1. Generate two random single digit integers
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);
            // 2. If number1 < number2, swap number1 with number2
           if (number1 < number2){
            int temp;
            temp = number1;
            number1 = number2;
            number2 = temp;
           }
           // 3. Prompt the student to answer "What is number1 - number2?"
           System.out.print("What is " + number1 + " - " + number2 + "? ");
           int answer = input.nextInt();

           if(answer == number1 - number2){
            System.out.println("You are correct!");
            // increase the correct answer count
            correctCount++; 
           }
           else{
            System.out.println("Your answer is wrong.\n " + number1 + " - " + number2 + " should be "+ (number1 -number2));
           }
           count++;

           output += "\n" + number1 + " - " + number2 + " = " + answer + ((number1 - number2 == answer) ? " correct" : " wrong"); 
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.print("\nCorrect count is " + correctCount + "\nTest time is" + testTime/1000 + "second\n" + output);
    }
}
