package telusko0928;

interface Alien<T>
{

}

class Generics <T> implements Alien <String>
{
    private T ref;
    public Generics(T ref)
    {
        this.ref = ref;
    }
    public void disp()
    {
        System.out.println("The type of t is "+ref.getClass().getName());
    }
    public T getRef()
    {
        return ref;
    }
}

public class Telusko002Generics
{
    public static void main(String[] args)
    {
        Generics<String> g = new Generics<>("Java");
        g.disp();
        System.out.println(g.getRef());

        Generics<Integer> g1 = new Generics<>(100);
        g1.disp();
        System.out.println(g1.getRef());
    }

}
