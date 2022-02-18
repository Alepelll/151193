import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Iterator;

public class Z2 {
    public static void main(String[] args) {
        LinkedHashSet<String>x=new LinkedHashSet<>();
        x.add("a");
        x.add("b");
        x.add("c");
        x.add("d");
        x.add("e");
        System.out.println(x);
        x=usunprzed(x);
        System.out.println(x);
        LinkedHashSet<Integer>s=new LinkedHashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println(s);
        s=usunprzed(s);
        System.out.println(s);
        LinkedHashSet<LocalDate>w=new LinkedHashSet<>();
        w.add(LocalDate.of(2422,12,11));
        w.add(LocalDate.of(1222,12,11));
        w.add(LocalDate.of(2322,12,11));
        w.add(LocalDate.of(2212,12,11));
        w.add(LocalDate.of(2222,12,11));
        System.out.println(w);
        w=usunprzed(w);
        System.out.println(w);
       }
      public static <E,I extends Iterable<E>> LinkedHashSet<E> usunprzed(I ex)
      {
          LinkedHashSet<E>x = new LinkedHashSet<>();
          int alpha=0;
          Iterator<E> a = ex.iterator();
          Iterator<E>b = ex.iterator();
          while (a.hasNext())
          {
              alpha++;
              a.next() ;
          }
          alpha=alpha-1;
          int xd=0;
          while (b.hasNext())
          {
              xd++;
              x.add(b.next());
              if(xd==alpha-1)
              {
                  b.next();
              }
          }
          return x;
      }
}
