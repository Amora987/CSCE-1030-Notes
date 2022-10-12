import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student's grade: ");

        double grade = input.nextDouble();
        // Check for which letter grade student got
        if (grade >= 90)
        System.out.println("A");
        else if (grade >= 80)
        System.out.println("B");
        else if (grade >= 70)
        System.out.println("C");
        else if (grade >= 60)
        System.out.println("D");
        else 
        System.out.println("F");

    }


    
}
