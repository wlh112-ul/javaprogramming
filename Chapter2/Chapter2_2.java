import java.util.Scanner;
public class Chapter2_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double m = input.nextDouble();
        double b = input.nextDouble();
        double gratuity,total;

        gratuity=m*b/100;
        total=m+gratuity;
        System.out.print("The gratuity is ");
        System.out.print(gratuity);
        System.out.print(" and total is ");
        System.out.print(total);
    }
}
