public class Classroom {

  public static void main(String[] args) {
    Wilder antoine = new Wilder("Antoine");
    Wilder dylan = new Wilder("Dylan");
    System.out.println(antoine.whoAmI());
    dylan.setAware(false);
    System.out.println(dylan.whoAmI());
  }
}
