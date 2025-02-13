import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива m: ");
        int m = in.nextInt();
        System.out.println("Введите размер массива n: ");
        int n = in.nextInt();
        int[][] array = new int[m][n];
        Random random = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        System.out.println("Было:");
        for (int i = 0; i < array.length; ++i) {
            int[] row = array[i];
            System.out.println(Arrays.toString(row));
        }
        for (int i = 0; i < m; i++) {
            int[] newarray = new int[n];
            System.arraycopy(array[i], 0, newarray, 0, n);
            InsertionSort(newarray);
            System.arraycopy(newarray, 0, array[i], 0, n);
        }
        System.out.println("Стало:");
        for (int i = 0; i < array.length; ++i) {
            int[] row = array[i];
            System.out.println(Arrays.toString(row));
        }
    }
    public static void InsertionSort(int[] SortArr) {
        int j;
        for (int i = 1; i < SortArr.length; i++){
            int swap = SortArr[i];
            for (j = i; j > 0 && swap < SortArr[j-1]; j--){
                SortArr[j] = SortArr[j-1];
            }
            SortArr[j] = swap;
        }
    }
}   