package classes;

public class Programmer extends Person {
  String mostUseLanguage;
  String role;
  String company;
  int careerYears;

  public Programmer() {
    super();
  }

  public Programmer(String firstName, String lastName, String mostUseLanguage, String role, String company,
      int careerYears) {
    super(firstName, lastName);
    this.mostUseLanguage = mostUseLanguage;
    this.role = role;
    this.company = company;
    this.careerYears = careerYears;
  }

  public Programmer(Person person, String mostUseLanguage, String role, String company, int careerYears) {
    super(person.getFirstName(), person.getLastName());
    this.mostUseLanguage = mostUseLanguage;
    this.role = role;
    this.company = company;
    this.careerYears = careerYears;
  }

  public String getFormattedIntroduction() {
    return String.format("Hello, I'm %s. I'm a %s at %s.\nI have %d years of experience in %s.", this.getFullName(),
        this.role, this.company, this.careerYears, this.mostUseLanguage);
  }

  public Person getPerson() throws Exception {
    if (this.getFullName().equals("John Doe")) {
      throw new Exception("Person is not defined");
    }

    return new Person(this.getFirstName(), this.getLastName());
  }

  public String getMostUseLanguage() {
    return this.mostUseLanguage;
  }

  public void setMostUseLanguage(String mostUseLanguage) {
    this.mostUseLanguage = mostUseLanguage;
  }

  public String getRole() {
    return this.role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getCompany() {
    return this.company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public int getCareerYears() {
    return this.careerYears;
  }

  public void setCareerYears(int careerYears) {
    this.careerYears = careerYears;
  }
}
