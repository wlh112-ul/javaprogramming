package week4;
import java.util.Scanner;
public class LabTask08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sideLength = sc.nextDouble();
        double area = (3*Math.sqrt(3)*Math.pow(sideLength,2))/2;
        System.out.println("The area is"+area);
    }
}
