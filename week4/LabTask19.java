package week4;
import java.util.Scanner;
public class LabTask19 {
    public static void main(String[] args){
        int number1 =(int)(System.currentTimeMillis() % 10); // generate number1
        int number2 = (int)(System.currentTimeMillis() / 10 % 10); //generate number2
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        System.out.print(
                "What is " + number1 +" + " + number2 + "?"); //show question
        int answer = input.nextInt(); // receive answer
        System.out.println(
                number1 +"+" + number2 + "=" + answer +" is"+
                        (number1+number2==answer)
        );
    }
}
