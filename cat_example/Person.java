package cat_example;

public class Person implements Observer {

    public Person() {
    }

    @Override
    public void update(Observable observable) {
        System.out.println("Cat's name is " + ((Cat) observable).getName());
    }
}
