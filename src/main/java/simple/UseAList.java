package simple;

import java.time.LocalDate;
import java.util.*;

public class UseAList {

  // Enable ALL warnings -Xlint:all
  // Warnings about "raw types"
  public static void breakAList(List/*<String>*/ al) {
    al.add(2, LocalDate.now());
  }

  public static void main(String[] args) {
//    List<String> names = new ArrayList<String>(
    // Java 7 added "diamond operator" which resolves the type of
    // right side in an assignment
    List<String> names = new ArrayList<>(
        Arrays.asList("Alex", "Jim"/*, LocalDate.now()*/)
    ); // Container of java.lang.Object
//    assert ((names = Collections.checkedList(names, String.class)) != null);
    names.add("Fred");
    names.add("Jim");
    names.add("Sheila");
//    Object o = LocalDate.now();
//    names.add((String)o);

//    breakAList(names);
    System.out.println("first element is " + names.get(0));

    String s = names.get(2);

//    Object x = "Hello";
//    String y = x;
  }
}
