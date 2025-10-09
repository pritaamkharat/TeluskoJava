package telusko0921;

//lang - No import statement
//util
//sql
//time
//net

import java.util.Date;

public class Telusko001DateTime {
    public static void main(String[] args) {
//        Date and Time ==> util,sql
        Date dateTime = new Date();   // Date class of util package will return both date and time.
        System.out.println(dateTime);
        System.out.println(dateTime.getYear());
        System.out.println(dateTime.getTime());

        Date dateTime1 = new Date(dateTime.getTime());
        Date dateTime2 = new Date(1758738498095L);
        System.out.println(dateTime2);

    }
}
