package Q1;
import java.util.Scanner;
/***********************************************************************************************
 Nadeen Shilbayeh
 Prompts user for a radius and height to calculate the volume of a cone
 **********************************************************************************************/
public class VolumeOfCone {
    public static void main(String[] args){//main method

        //defines a scanner object called input
        Scanner input = new Scanner(System.in);

        //asks user to input height of cone
        System.out.println("Please enter the height of the cone:");
        double height = input.nextDouble(); //reads a double value from the standard input

        //asks user to input radius of cone
        System.out.println("Please enter the radius of the cone:");
        double radius = input.nextDouble(); //reads a double  value from the standard input

        //calculates the volume of the cone and stores it in a double variable
        double volume = (Math.PI*Math.pow(radius,2)*height)/3.0;

        //outputs the volume to 2 decimal places
        System.out.printf("The volume of a cone with radius %.2f cm and height of %.2f cm is: %.2f cubic cm",
                radius,height,volume);
    }
}
