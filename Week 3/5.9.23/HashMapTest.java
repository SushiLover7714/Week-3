import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("UK", "London");
        capitalCities.put("USA", "Washington DC");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Poland", "Warsaw");
        System.out.println(capitalCities);
        System.out.println(capitalCities.get("Germany"));
        capitalCities.remove("USA");
        System.out.println(capitalCities);
    }
}
