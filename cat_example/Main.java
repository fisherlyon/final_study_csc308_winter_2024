package cat_example;

public class Main {
    
    public static void main(String[] args) {
        Cat cat = new Cat("Harold");
        Person person = new Person();

        cat.addObserver(person);
        cat.needSomething();
    }
}
