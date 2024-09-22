import java.util.Scanner;
public class Chapter2_4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double dis = input.nextDouble();
        double oil = input.nextDouble();
        double price = input.nextDouble();
        double money;

        money=dis/oil*price;
        System.out.print("The cost of driving is $");
        System.out.print(money);
    }
}
