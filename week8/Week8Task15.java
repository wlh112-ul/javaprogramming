public class Week8Task15 {
    public static void main(String[] args) {
        int[] myArray ={1,3,5};
        printArray(myArray);
        System.out.println();
        printArray(new int[]{3,1,2,6,4,2});
    }

    private static void printArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]+" ");
        }
    }
}
