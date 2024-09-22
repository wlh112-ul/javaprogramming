import java.util.Scanner;
public class Chapter2_5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double s = input.nextDouble();
        double area;

        area=Math.pow(3,1.5)*s*s/2;
        System.out.print("The area of the hexagon is ");
        System.out.print(area);
    }
}
