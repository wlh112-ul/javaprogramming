public class Lab6Task9 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i <= rows; i++) {
            for (int j = rows-1; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
