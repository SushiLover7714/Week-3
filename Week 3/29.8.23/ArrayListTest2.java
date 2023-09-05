import java.util.Collections;
import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(4);
        intList.add(2);
        intList.add(5);
        intList.add(1);
        intList.add(3);
        Collections.sort(intList);
        System.out.println(intList);
        Collections.sort(intList, Collections.reverseOrder(null));
        System.out.println(intList);
    }
}
