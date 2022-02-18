import java.time.LocalDate;
import java.util.LinkedList;

public class Z1 {
    public static void main(String [] arg)
    {
        LinkedList<Integer>a=new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        System.out.println(a);
        a=redukuj(a,3);
        System.out.println(a);
        LinkedList<Integer>b=new LinkedList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        System.out.println(b);
        b=redukuj(b,2);
        System.out.println(b);
        LinkedList<LocalDate>c=new LinkedList<>();
        c.add(LocalDate.of(2252,12,11));
        c.add(LocalDate.of(2242,11,15));
        c.add(LocalDate.of(2232,12,11));
        c.add(LocalDate.of(2122,11,11));
        c.add(LocalDate.of(2222,11,11));
        System.out.println(c);
        c=redukuj(c,2);
        System.out.println(c);
        LinkedList<LocalDate>d=new LinkedList<>();
        d.add(LocalDate.of(2223,1,11));
        d.add(LocalDate.of(2222,1,21));
        d.add(LocalDate.of(2221,11,11));
        d.add(LocalDate.of(2200,11,11));
        d.add(LocalDate.of(2217,11,11));
        System.out.println(d);
        d=redukuj(d,2);
        System.out.println(d);
    }
    public static <T> LinkedList<T> redukuj(LinkedList<T>x,int n)
    {
        LinkedList<T>ba=new LinkedList<>();
        int b=1;
        for(T xd:x)
        {
            if(b!=n)
            {
                ba.add(xd);
                b++;
                continue;
            }
            if(b==n)
            {
                b=1;
                continue;
            }
        }
        return ba;
    }
}
