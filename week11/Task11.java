import java.util.Arrays;
import java.util.Comparator;

public class Task11 {
    public static void main(String[] args) {
        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        int[] employeeTotalHours = new int[hours.length];

        for (int i = 0; i < hours.length; i++) {
            int sum = 0;
            for (int j = 0; j < hours[i].length; j++) {
                sum += hours[i][j];
            }
            employeeTotalHours[i] = sum;
        }

        Integer[] employeeIds = new Integer[employeeTotalHours.length];
        for (int i = 0; i < employeeIds.length; i++) {
            employeeIds[i] = i;
        }

        Arrays.sort(employeeIds, Comparator.comparingInt(i -> -employeeTotalHours[i]));
        System.out.println("Employee\tTotal Hours");
        for (Integer id : employeeIds) {
            System.out.printf("Employee %d:\t%d\n", id, employeeTotalHours[id]);
        }
        
    }
}
