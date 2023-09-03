import java.util.Scanner;
import java.util.Arrays;

public class DynamicArray4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.print("Enter num: ");
        int num = input.nextInt();
        int[] newArr = new int[arr.length - 1];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != num && index < 8) {
                newArr[index] = arr[i];
                index++;
            }
        }

        if (index == arr.length - 1) {
            System.out.println("Number not found in the array.");
        } else {
            arr = newArr;
            System.out.println(Arrays.toString(arr));
        }
    }
}
