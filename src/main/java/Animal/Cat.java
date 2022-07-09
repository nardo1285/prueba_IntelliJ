package Animal;

public class Cat {

  private String race;
  private Integer age;
  private String name;

  public Cat() {

  }

  public Cat(String race, Integer age, String name) {
    this.race = race;
    this.age = age;
    this.name = name;
  }

  public String getRace() {
    return race;
  }

  public void setRace(String race) {
    this.race = race;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "This cat is " + name + '\'' +
        ", has " + age + " years old, and is a " + race + '\'' + '}';
  }
}
