import java.util.Scanner;
public class Chapter2_6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double m = input.nextDouble();
        double money=0;

        money+=m*1.00417;
        m=m*1.00417;
        money+=m*1.00417;
        m=m*1.00417;
        money+=m*1.00417;
        m=m*1.00417;
        money+=m*1.00417;
        m=m*1.00417;
        money+=m*1.00417;
        m=m*1.00417;
        money+=m*1.00417;
        m=m*1.00417;
        System.out.print("After the sixth month,the account value is $ ");
        System.out.print(money);
    }
}
