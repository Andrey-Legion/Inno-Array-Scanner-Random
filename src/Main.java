import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arrS = scanArray(6);
        printArray(arrS);
        int[] arr = randomArray(10);
        printArray(arr);
    }

    //Task 1-консольный ввод только элементов массива
    public static int[] scanArray(int lengthArray) {
        int[] arrS = new int[lengthArray];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < arrS.length; i++) {
            arrS[i] = in.nextInt();
        }
        return arrS;

    }

    //Task 2-счётчик случайных чисел в массиве
    public static int[] randomArray(int lengthArray) {
        int[] arr = new int[lengthArray];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(13);
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
