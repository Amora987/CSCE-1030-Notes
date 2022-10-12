import java.util.Scanner;

public class RepeatAdditionQuiz{
    public static void main(String[] args){
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Prompt user to enter an answer
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        while(answer != number1 + number2) {
            System.out.print("Sorry wrong answer, try again. What is " + number1+ " + " + number2 + "? ");
            answer = input.nextInt();
        }
        System.out.print("Correct Answer!");
    }
}