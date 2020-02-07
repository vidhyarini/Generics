package shopping;

//public class ClothingPair<E extends Sized, String> extends Pair<E> {
//  java.lang.String s = "Hello";
// Can have 0 or 1 CLASSNAME, followed by any number of intefaces
public class ClothingPair<E extends /*Object &*/ Sized & Colored> extends Pair<E> {

  public ClothingPair(E left, E right) {
    super(left, right);
  }

  public boolean matched() {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }

  public static <E extends Sized & Colored> boolean match(E left, E right) {
    return left.getSize() == right.getSize()
        && left.getColor().equals(right.getColor());
  }

  public <F> void weird(E extra, F other) {}

  @Override
  public String toString() {
    return "ClothingPair{" +
        "left=" + left +
        ", right=" + right +
        '}';
  }
}
