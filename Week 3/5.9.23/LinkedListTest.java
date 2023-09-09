import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Honda");
        cars.add("Toyata");
        cars.add("Mercedes");
        cars.add("KIA");
        System.out.println(cars);
        System.out.println(cars.size());
        cars.add(2, "Porcshe");
        System.out.println(cars);
        cars.set(1, "Volvo");
        cars.get(1);
        System.out.println(cars.get(1));
        cars.addFirst("Honda2");
        System.out.println(cars);
        cars.addLast("Toyata2");
        System.out.println(cars);
        cars.removeFirst();
        System.out.println(cars);
        cars.removeLast();
        System.out.println(cars);
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
    }
}
