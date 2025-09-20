package telusko0906;

public class Telusko006Wrapper {
    public static void main(String[] args) {

        //int, float, char

//        Integer
//        Float
//        Double
//        Character
//        Byte
//        Short
//        Long
//        Boolean
//        Integer i = new Integer(10);   //deprecated
        Integer i = Integer.valueOf(10);
        System.out.println(i);

        //Boxing unboxing
        //Autoboxing Auto unboxing
        int n1=10;
        Integer iobj = Integer.valueOf(n1);  //converting primitive value into corresponding object==> Boxing
        System.out.println(iobj);

        Integer iobj2 = n1;  //converting primitive value into corresponding object automatically ==> Auto  Boxing
        System.out.println(iobj2);

        Double dobj = Double.valueOf(45.4);
        double data = dobj;  //converting Object data to its corresponding primitive data automatically ==>Auto Unboxing
        double mdata = dobj.doubleValue(); //converting Object data to its corresponding primitive data ==> Unboxing 

    }
}
