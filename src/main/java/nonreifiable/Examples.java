package nonreifiable;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Examples {
  public static <E> List<E> asList(E[] in) {
    List<E> res = new ArrayList<>();
    for (E e : in) {
      res.add(e);
    }
    return res;
  }

  public static <E extends F, F> F[] asArray(List<E> in, Class<F> cl) {
//    E[] res = new E[in.size()]; // Not Possible..!!!
//    E[] res = (E[])new Object[in.size()]; // BAD!!!
    E[] res = (E[])Array.newInstance(cl, in.size());

    for (int i = 0; i < res.length; i++) {
      res[i] = in.get(i);
    }
    return res;
  }

  public static void main(String[] args) {
    String[] sa = { "Fred", "Jim", "Sheila" };
    List<String> ls = asList(sa);
    System.out.println("From list: " + ls.get(0));

//    Object[] sa2 = asArray(ls, Object.class);
//    CharSequence[] sa2 = asArray(ls, CharSequence.class);
    String[] sa2 = asArray(ls, String.class);
    System.out.println("From Array: " + sa2[0]);
    System.out.println("Array type is " + sa2.getClass().getName());
  }
}
