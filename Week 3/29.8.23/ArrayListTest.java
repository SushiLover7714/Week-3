import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Volvo");
        System.out.println(cars);
        System.out.println(cars.size());
        cars.add(2, "Chervolet");
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.get(0));
        cars.set(0, "Chervolet");
        System.out.println(cars);
        cars.remove(3);
        System.out.println(cars);
        // cars.clear();
        // System.out.println(cars);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

    }
}
