package telusko0921;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@interface CricketPlayer{
    String country() default "India";
    int age() default 34;

}

@CricketPlayer(country = "India",age = 35)
class ViratKohali
{
    @CricketPlayer
    private int innings;
    @CricketPlayer
    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }
}

public class Telusko006Annotation {
    public static void main(String[] args)
    {
        ViratKohali vk = new ViratKohali();
        Class cls = vk.getClass();
        Annotation an =cls.getAnnotation(CricketPlayer.class);
        CricketPlayer cp = (CricketPlayer) an;
        int age = cp.age();
        String country = cp.country();
        System.out.println(age);
        System.out.println(country);

    }
}
