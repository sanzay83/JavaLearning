package Sanjay.Topics.Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        // <String> only holds string list
        List<String> strList = new ArrayList<>();
        strList.add("FirstString");
        strList.add("SecondString");
        strList.add(1, "MiddleString");

        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        strList.remove("MiddleString");
        strList.remove(1);
        strList.set(0, "FirstItem");
        if (strList.contains("FirstItem")) {
            System.out.println(strList.size());
            System.out.println(strList.indexOf("FirstItem"));
        }
        ;
    }
}
