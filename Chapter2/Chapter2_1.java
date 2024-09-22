import java.util.Scanner;
public class Chapter2_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();
        double h = input.nextDouble();
        double area,volume;

        area=r*r*3.14159;
        volume=area*h;
        System.out.print("The area is ");
        System.out.println(area);
        System.out.print("The volume is ");
        System.out.println(volume);
    }
}
