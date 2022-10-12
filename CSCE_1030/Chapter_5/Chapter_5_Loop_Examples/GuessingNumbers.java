import java.util.Scanner;

public class GuessingNumbers {
    public static void main(String[] args){
        
        // Create Scanner class
        Scanner input = new Scanner(System.in);

        // Generate a random number between 0 to 100
        int number = (int)(Math.random() * 101);
        System.out.print("Guess a magic number between 0 and 100");
        int guess = -1;

        while (guess != number){
            System.out.print("\nEnter your guess: ");
            guess= input.nextInt();
            if (guess == number){
                System.out.print("Yes the number is " + number);
            }
            else if (guess < number){
                System.out.print("Your guess is too low");
            }
            else if (guess > number){
                System.out.print("Your guess is too high");
            }
            
        }
    }
}
