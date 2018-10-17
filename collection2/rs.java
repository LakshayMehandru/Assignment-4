import java.util.*;
public class rs
{
public static void main(String[] args)
{
HashSet h1=new HashSet();
h1.add(25);
h1.add(56);
h1.add(94);
h1.add(21);
h1.add(88);
HashSet h2=new HashSet();
h2.add(25);
h2.add(22);
h2.add(46);
h2.add(88);
h2.add(98);
h1.retainAll(h2);
System.out.println(h1);
}
}







