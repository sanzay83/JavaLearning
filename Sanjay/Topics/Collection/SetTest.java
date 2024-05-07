package Sanjay.Topics.Collection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("FirstString"));
        System.out.println(names.add("SecondString"));
        System.out.println(names.add("ThirdString"));
        Utility.print(names);
        System.out.println(names.add("FirstString"));
        System.out.println(names.contains("FirstString"));
        System.out.println(names.size());
        Utility.print(names);
        System.out.println(names.remove("FirstString"));
        Utility.print(names);
        System.out.println(names.remove("FirstString"));
    }
}
