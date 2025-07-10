package hackerrank.collections.maps;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class MapClass {
    public static void main(String[] args) {

        Map<Integer, String> persons =
                Map.of(1, "Ionel", 2, "Gigel", 3, "Carcel", 4, "Marcel", 5,
                        "Vasilica"); // does not preserve the order but improves efficiency
//        new HashMap<>();
//        persons.put(1, "Grigore");
//        persons.put(2, "Marcel");
//        persons.put(3, "Ionel");
//        persons.put(4, "Gigel");
//        persons.put(5, "Carcel");

        // 1 For Loop  ===============================
        //        for (Map.Entry<Integer, String> person : persons.entrySet()) {
        //            System.out.println("ID " + person.getKey() + " Value " + person.getValue());
        //        }

        // 2 For Loop Java 10+ ===============================
        //        for (var person : persons.entrySet()) {
        //            System.out.println("ID " + person.getKey() + " Value " + person.getValue());
        //        }

        // 3 Use Stream ===============================
        Set<Map.Entry<Integer, String>> entries = persons.entrySet();
        entries.stream()
                .sorted(Map.Entry.comparingByKey(Comparator.naturalOrder())) // order map elements by key
                .forEach(p -> System.out.println("ID " + p.getKey() + " Value " + p.getValue()));
    }
}
