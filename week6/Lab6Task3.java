import java.util.Scanner;
public class Lab6Task3 {
    public static void main(String[] args) {
        int number = (int)(Math.random()*101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        int guess=-1;
        while (guess!=number) {
            System.out.println("\nenter your guess");
            guess=input.nextInt();
            if(guess==number)
                System.out.println("Yes,the number is " + number);
            else if(guess>number)
                System.out.println("your guess is too high");
            else
                System.out.println("your guess is too low");
        }
    }
}
