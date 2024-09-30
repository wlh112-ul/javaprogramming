package week4;
import java.util.Scanner;
public class LabTask07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance = sc.nextDouble();
        double efficency = sc.nextDouble();
        double pricePerGallon = sc.nextDouble();
        double cost = (distance/efficency)*pricePerGallon;
        System.out.print("The cost is %2f meiyuan"+cost);
    }
}
