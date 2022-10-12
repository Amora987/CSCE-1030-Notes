import java.util.Scanner;

public class DayTemperature {
    public static void main(String[] args){

        //Create scanner class
        Scanner input = new Scanner(System.in);

        //Prompt user to enter today's temperature
        System.out.print("Enter today's temperature: ");

        int todays_temp = input.nextInt();

        switch(todays_temp){
            case 90: System.out.print("BURNING HOT");break;
            case 80: System.out.print("HOT"); break;
            case 70: System.out.print("PLEASANT"); break;
            case 60: System.out.print("COLD"); break;
            default: System.out.print("TEMPERATURE COULD NOT BE DISPLAYED");
        }

    }
    
}
