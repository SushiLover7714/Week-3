import java.util.Arrays;

public class DynamicArray2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] tempArr = new int[4];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            tempArr[i] = arr[i];
        }
        arr = tempArr;
        System.out.println(Arrays.toString(arr));
    }
}
