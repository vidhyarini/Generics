package taxable;

import java.util.ArrayList;
import java.util.List;

public class Accountants {
  public static void doTaxes(Taxable t) {}
  public static void doBulkTaxes(Taxable[] ta) {
    ta[0] = new Corporation();
  }

  // Collect individuals for Joe (only Individuals)...
  // Contra-variance
  public static void collectJoesClients(List<? super Individual> clients) {
//    Individual ind = clients.get(0); // NOT SAFE
    clients.add(new Individual());
    clients.add(new Individual());
    clients.add(new Retiree());
//    clients.add(new Taxable());
  }

  // this is "Co-Variance"
  public static void doBulkTaxes(List<? extends Taxable> lt) {
    for (Taxable t : lt) {
      doTaxes(t);
    }
//    lt.add(new Corporation());
//    lt.add(new Taxable());
//    lt.add(new Individual());
  }
  public static void main(String[] args) {
    List<Taxable> clients = new ArrayList<>();
    clients.add(new Individual());
    clients.add(new Corporation());
    doBulkTaxes(clients);

    List<Individual> joesClients = new ArrayList<>();
    joesClients.add(new Individual());
//    collectJoesClients(joesClients);
    collectJoesClients(clients);

    doBulkTaxes(joesClients);
    doBulkTaxes(new ArrayList<Corporation>());

    Individual[] ia = { null };
    doBulkTaxes(ia); // fails at runtime!
  }
}
