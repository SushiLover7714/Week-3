import java.util.Arrays;

public class DynamicArray3 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        int[] tempArr = new int[arr.length + 1];
        System.out.println(Arrays.toString(arr));
        tempArr[0] = 5;
        for (int i = 1; i < arr.length + 1; i++) {
            tempArr[i] = arr[i - 1];
        }
        arr = tempArr;
        System.out.println(Arrays.toString(arr));
    }
}
