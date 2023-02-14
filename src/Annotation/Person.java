package Annotation;

@Fielder
public class Person {
    @Fielder(params = "Person - age annotation")
    private int age;
    @Fielder
    private String name;
    @Fielder(params = "Person - pulse annotation")
    private int pulse;

    public Person(int age, String name, int pulse) {
        this.age = age;
        this.name = name;
        this.pulse = pulse;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", pulse=" + pulse +
                '}';
    }
}
