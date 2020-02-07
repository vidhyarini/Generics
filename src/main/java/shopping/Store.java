package shopping;

public class Store {
  public static void main(String[] args) {
    ClothingPair<Shoe> shoes =
        new ClothingPair<>(new Shoe(8, "Red"), new Shoe(8, "Pink"));
    System.out.println(shoes + " match? " + shoes.matched());
  }
}
