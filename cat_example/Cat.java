package cat_example;

public class Cat extends Observable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void needSomething() {
        notifyObservers();
    }
}
