
public class Task14 {
    public static void shuffle(int[][] m) {
        int size = m.length;
        java.util.Random random = new java.util.Random();

        for (int i = 0; i < size; i++) {
            int randIndex = random.nextInt(size);
            int[] temp = m[i];
            m[i] = m[randIndex];
            m[randIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        System.out.println("Before shuffling:");
        printMatrix(m);

        shuffle(m);
        System.out.println("\nAfter shuffling:");
        printMatrix(m);
    }
    private static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}