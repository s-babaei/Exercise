package ir.digipay;



public class Person extends Test {

    private String name;

    public Person(Long id, String name) {
        super(id);
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
