import java.io.File;
import java.util.Arrays;
public class zad3 {
    public static void main(String[] args) {
        String xa=".";
        String[] pliki=filelist(xa, "txt");
        for(String t :pliki)
        {
            System.out.println(t);
        }
       }
       public static String[] filelist(String x,String roz)
       {
           File file=new File(x);
           return file.list(((dir,name)->!name.endsWith(roz)));
       }
}
