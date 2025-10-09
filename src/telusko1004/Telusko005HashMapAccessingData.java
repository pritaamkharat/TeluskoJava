package telusko1004;

import java.util.*;

interface Alpha1
{
    interface Beta1
    {
        static void disp(){
            System.out.println("Static method of Beta");
        }
    }

}

public class Telusko005HashMapAccessingData {

    public static void main(String[] args) {

        Alpha1.Beta1.disp();
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"Java");   //key value pair  Entry
        hm.put(2,"SpringBoot");
        hm.put(3,"AI");
        System.out.println(hm);

        String data = hm.get(1);
        System.out.println(data);

        Set<Integer> keys=hm.keySet();
        Iterator<Integer> itrk = keys.iterator();
        while(itrk.hasNext()){
            System.out.println(itrk.next());
        }

        Collection<String> values = hm.values();
        Iterator<String> itrv = values.iterator();
        while(itrv.hasNext()){
            System.out.println(itrv.next());
        }

//        Set<Map.Entry<Integer,String>> entries= hm.entrySet();
//        Iterator<Map.Entry<Integer,String>> itre = entries.iterator();
//        while (itre.hasNext()){
//            Map.Entry<Integer,String> entry= itre.next();
//            System.out.println(entry.getKey()+"-"+entry.getValue());
//        }

        Set entry = hm.entrySet();
        Iterator itre = entry.iterator();
        while (itre.hasNext()){
            Map.Entry pair = (Map.Entry) itre.next();
            System.out.println(pair.getKey()+"-"+pair.getValue());
        }
    }
}
