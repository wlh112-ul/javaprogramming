
import java.util.Scanner;
public class ComputeAndInterpretBMI {
    public static void main(String[]args){
        Scanner input =new Scanner(System.in);
        //Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds:");double weight =input.nextDouble();
        //Prompt the user to enter height in inches
        System.out.print("Enter the height in inches:");double height =input.nextDouble();
        final double KILLOGRAMS_PER_POUND =0.45359237;//Constantfinal 
        double METER_PER_INCH =0.0254;//Constant
        //Compute BMI
        double weightInKillograms =weight *KILLOGRAMS_PER_POUND;
        double heightInMeters =height *METER_PER_INCH;
        double bmi =weightInKillograms /(heightInMeters *heightInMeters);
        //Display the result
        System.out.println("BMI is "+bmi);
        if (bmi<18.5){
            System.out.println("Underweight");
        }else if(bmi<25){
            System.out.println("Normal");
        }else if(bmi<30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}