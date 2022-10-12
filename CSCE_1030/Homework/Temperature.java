
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        //setup Scanner input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's temperature: ");
        int temp = input.nextInt();
        
        if (temp >= 90)
        System.out.println("BURNING HOT");
        else if (temp >= 80)
        System.out.println("HOT");
        else if (temp >= 70)
        System.out.println("PLEASANT");
        else if (temp >= 60)
        System.out.println("COLD");
        else
        System.out.println("TEMPERATURE NOT AVAILABLE");
    }
    
}
