import java.util.Scanner;
public class Chapter2_3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double p = input.nextDouble();
        double i = input.nextDouble();
        double BMI;

        BMI=(p*0.45359237)/(i*0.0254)/(i*0.0254);
        System.out.print("BMI is ");
        System.out.print(BMI);
    }
}
