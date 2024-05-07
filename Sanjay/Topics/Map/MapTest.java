package Sanjay.Topics.Map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Sanjay", 95);
        marks.put("Santosh", 90);
        marks.put("KB", 80);
        System.out.println(marks.size());
        System.out.println(marks.get("Sanjay"));
        System.out.println(marks.containsKey("Sanjay"));
        System.out.println(marks.containsKey("Duwal"));
        System.out.println(marks.remove("KB"));

        for (String key : marks.keySet()) {
            System.out.printf("%s: %s \n", key, marks.get(key));
        }
    }
}
