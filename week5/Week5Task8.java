import java.util.Scanner;
public class Week5Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = input.nextLine();

        int length = userInput.length();

        System.out.println("The length of the entered string is: " + length);

        input.close();
    }
}
