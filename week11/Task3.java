public class Task3 {
    public static void main(String[] args) {
        // Create a 2D array
        int[][] matrix = new int[3][3];
        
        // Insert random values (0-19) in 2D array
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = (int)(Math.random() * 20);
            }
        }

        
        // Display value at row 0 and column 0
        System.out.println(matrix[0][0]);
    }
}
