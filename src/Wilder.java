public class Wilder {

  // attributes
  private String firstname;
  private boolean aware;

  // constructors
  public Wilder(String firstname) {
    this.firstname = firstname;
    this.aware = true;
  }

  // getters
  public String getFirstname() {
    return this.firstname;
  }

  public boolean isAware() {
    return this.aware;
  }

  // setters
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public void setAware(boolean aware) {
    this.aware = aware;
  }

  // instance method
  public String whoAmI() {
    return (
      "Je m'appelle " +
      this.getFirstname() +
      (this.isAware() ? " et je suis aware" : " et je ne suis pas aware")
    );
  }
}
