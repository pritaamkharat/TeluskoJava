package telusko0921;

import java.util.Arrays;

enum Week{
    MONDAY, TUESDAY, WEDNESDAY , THURSDAY, FRIDAY, SATURDAY, SUNDAY;

}

enum HttpStatus{
    OK,CREATED;
}


public class Telusko003Enum {
    public static void main(String[] args) {
        Week week = Week.MONDAY;
        System.out.println(week);

        int index = Week.FRIDAY.ordinal();
        System.out.println(index);

        Week [] days = Week.values();
        for (Week data:days){
            System.out.println(data.ordinal() +"==>"+data);
        }
        System.out.println(Arrays.toString(Week.values()));

    }
}
