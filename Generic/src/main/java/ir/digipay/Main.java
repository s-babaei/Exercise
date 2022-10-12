package ir.digipay;

public class Main {

    public static void main(String[] args) {


        Repository<Person> repository = new Repository<>();

        Person person = new Person(1l, "sara");
        Person person1 = new Person(2l, "babaei");
        Person person2 = new Person(3l, "perfect");

        repository.save(person);
        repository.save(person1);
        repository.save(person2);

        System.out.println(repository.getAll());
        System.out.println(repository.findById(3l));
        repository.remove(new Person(1l,"sara"));
        System.out.println(repository.getAll());
        repository.update(new Person(2l,"nafas"),2l);
        System.out.println(repository.getAll());
        


    }


}
