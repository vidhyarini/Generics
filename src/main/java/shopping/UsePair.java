package shopping;

import java.time.LocalDate;

public class UsePair {
  public static void main(String[] args) {
    Pair<String> p = new Pair<>("Hello", "Joe");
    String s = p.getLeft();
    p.setRight("Albert");
    System.out.println(p);
  }
}
