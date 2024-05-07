package Sanjay.Topics.Collection;

import java.util.Collection;

public class Utility {
    public static void print(Collection collection) {
        for (Object coll : collection) {
            System.out.printf("%s ", coll);
        }
        System.out.println();
    }
}
