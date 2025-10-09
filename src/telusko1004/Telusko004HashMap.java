package telusko1004;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

class Telusko
{
    int id;
    String name;

    public Telusko(int id,String name){
        this.id=id;
        this.name= name;
    }

    @Override
    public String toString(){
        return "Telusko[id="+id+", name=" + name+ "]";
    }
}

public class Telusko004HashMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();
        hm.put(1,"Pritam");
        hm.put(2,"Rajat");
        hm.put(3,"Rahul");
//        System.out.println(hm);

        Telusko t1 = new Telusko(101,"Pritam");
        Telusko t2 = new Telusko(102,"Rajat");

        HashMap hm2 = new HashMap<>();
//        hm2.put(t1, 1000);
//        hm2.put(t2, 2000);

        hm2.put(t1.id,"Hyder Abbas");
        hm2.put(t2.id,"Navin Reddy");
        hm2.put("Devops","AI");
//        System.out.println(hm2);

        HashMap<Integer, String> hm3 = new HashMap<>();
        hm3.put(1,"Java");
        hm3.put(1,"Java");    // key must be unique and value need not to be unique
        hm3.put(null,"Java"); // key can be null
        hm3.put(null,"Sam");
        hm3.put(null,null);
        hm3.put(4,"lam");
        hm3.put(3,"dae");
//        hm3.put("Satara","sam");   //compile time error
        // Key must be unique
//        System.out.println(hm3);    //order of insertion is not maintained

        LinkedHashMap<Integer,String> hm4 = new LinkedHashMap<>();
        hm4.put(1,"Java");
        hm4.put(1,"Java");
        hm4.put(null,"Java");
        hm4.put(null,"Sam");
        hm4.put(null,null);
        hm4.put(4,"lam");
        hm4.put(3,"dae");
//        System.out.println(hm4);

        TreeMap tm = new TreeMap();
        tm.put(2,"Hibernate");
        tm.put(1,"SpringBoot");
        tm.put(3,"Java");
//        tm.put(null,"SQL");  //NullPointerException   key can not be null
        tm.put(5,null);    //value can be null
//        System.out.println(tm);

        Hashtable ht = new Hashtable();
        ht.put(3,"Hibernate");
        ht.put(2,"Java");
        ht.put(4,"SpringBoot");
//        ht.put(null,"AI");    //Cannot invoke "Object.hashCode()" because "key" is null
        ht.put(5,null);    //value can not be null
//        System.out.println(ht);

        ConcurrentHashMap chm = new ConcurrentHashMap();
//        chm.put(null,"Java");    //NullPointerException   key can not be null
//        chm.put(2,null);   //NullPointerException   value can not be null
        System.out.println(chm);
    }
}
