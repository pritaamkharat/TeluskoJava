package telusko0906;

public class Telusko001String {
    public static void main(String[] args) {
        String str = "Telusko";
        String str1= "Telusko";

        System.out.println(str.hashCode());   //235781885
        System.out.println(str1.hashCode());  //235781885
        str = "DevOps with AWS";
        System.out.println(str.hashCode());   //2087656134

        String str2 = "Alien";
        str2.concat("DevOps with AWS");
        System.out.println(str2);    //Alien
        System.out.println(str2.hashCode());    //63350439
        str2 = str2.concat(" DevOps with AWS");
        System.out.println(str2);   //Alien DevOps with AWS
        System.out.println(str2.hashCode());   //724913997

        //If we attempt to modify String object a new String object would be created
    }
}
