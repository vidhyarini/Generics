package shopping;

public class Shoe implements Sized, Colored {
  private int size;
  private String color;

  public Shoe(int size, String color) {
    this.size = size;
    this.color = color;
  }

  public int getSize() {
    return size;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return "Shoe{" +
        "size=" + size +
        ", color='" + color + '\'' +
        '}';
  }
}
