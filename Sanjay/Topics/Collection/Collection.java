package Sanjay.Topics.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(2);
        num.add(8);
        num.add(-2);
        num.add(2);
        num.add(7);
        num.add(2);
        num.add(8);
        Utility.print(num);

        Collections.sort(num);
        Utility.print(num);

        Collections.reverse(num);
        Utility.print(num);

        int min = Collections.min(num);
        int max = Collections.max(num);
        System.out.println(min + " " + max);
        System.out.println(Collections.frequency(num, 2));
        System.out.println(Collections.frequency(num, 8));
        List<Integer> unModifiableList = Collections.unmodifiableList(num);
        // unModifiableList.add(5);
    }
}
