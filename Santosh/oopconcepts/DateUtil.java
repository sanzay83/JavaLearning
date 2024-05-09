package Santosh.oopconcepts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//aaja ko din ani aaja ko din katyo ki nai else garxa
public class DateUtil {

    //    public static boolean isExpired(Date, epxDate) {
//    LocalDate today = LocalDate.now();
//    DateTimeFormatter format = DateTimeFormatter.ofPattern("MMdd");
//    String aja = today.format(format);
//        return ;
//    }

    public static String aajaKoDin() {

        LocalDate today = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd");
        return today.format(format);

    }

}
