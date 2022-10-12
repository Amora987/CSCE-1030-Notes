
import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        
        //prompt user to enter height in inches
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        // set constant variables
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCHES = 0.0254;

        // calculate BMI
        double BMI = ((weight * KILOGRAMS_PER_POUND)/((double)(Math.pow((height * METERS_PER_INCHES),2))));

        //Display Result
        System.out.println("BMI is " + BMI);
       
        //Check interpretation
        if (BMI <= 18.5)
        System.out.println("Underweight");
        else if (BMI < 25.0)
        System.out.println("Normal");
        else if (BMI < 30.0)
        System.out.println("Overweight");
        else
        System.out.println("Obese");
    }

    
}
