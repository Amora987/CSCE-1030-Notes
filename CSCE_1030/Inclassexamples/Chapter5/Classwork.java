import java.util.Scanner;

public class Classwork {
    public static void main(String[] args){
        // Create the Scanner Class
        Scanner input = new Scanner(System.in);

        //Prompt user to enter three variables
        System.out.print("Enter three integers you want to companre: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //temp variable
        int temp;

        if(a > b){
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c){
           temp = b;
           b = c;
           c = temp;
        }
        if (a > b){
            temp = a;
            a = b;
            b = temp;
        }
        System.out.print(a + ", " + b + ", "+ c);
    }
}
    
