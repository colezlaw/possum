package bubbasoft.possum.beans;

public class Person {
  private String surname;
  private String givenName;
  
  public Person() {}
  
  public Person(String surname, String givenName) {
    setSurname(surname);
    setGivenName(givenName);
  }
  
  public void setSurname(String surname) {
    this.surname = surname;
  }
  
  public String getSurname() {
    return surname;
  }
  
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }
  
  public String getGivenName() {
    return givenName;
  }
}
