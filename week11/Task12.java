import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        double[][] m = new double[3][4];
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a 3-by-4 matrix row by row:");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < m[0].length; i++) {
            System.out.printf("Sum of the elements at column %d is %.1f\n", i, sumColumn(m, i));
        }
        
    }


    public static double sumColumn(double[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];
        }
        return sum;
    }
}
