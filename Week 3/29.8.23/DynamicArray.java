import java.util.Arrays;

public class DynamicArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        int[] tempArr = new int[4];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }
        tempArr[3] = 4;
        arr = tempArr;
        System.out.println(Arrays.toString(arr));
    }
}
