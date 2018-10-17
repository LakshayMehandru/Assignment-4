import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class H() 
{
    public static void main(String []args)
    {
        HashMap h1= new HashMap();
        h1.put("piya","8168294365");
        h1.put("sid","4499991712");
        h1.put("abhay","9867435601");
        Set s = h1.keySet();
                Iterator i= s.iterator();
        while(i.hasNext())
        {
            System.out.println(h1.get(i.next()));
        }
    }
}
