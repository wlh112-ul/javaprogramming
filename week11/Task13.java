import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();

        // Fill the matrix with random 0s and 1s
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }

        // Print the matrix
        System.out.println("The matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        int maxRow = -1;
        int maxRowCount = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxRowCount) {
                maxRowCount = count;
                maxRow = i;
            }
        }

        int maxColumn = -1;
        int maxColumnCount = Integer.MIN_VALUE;
        for (int j = 0; j < 4; j++) {
            int count = 0;
            for (int i = 0; i < 4; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxColumnCount) {
                maxColumnCount = count;
                maxColumn = j;
            }
        }
        System.out.println("The largest row index: " + maxRow);
        System.out.println("The largest column index: " + maxColumn);
    }
}
