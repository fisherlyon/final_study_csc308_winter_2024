package professor_example;

public class Professor extends Observable {
    String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addNameToWhiteboard() {
        Whiteboard.getInstance().addName(this.name);
    }
}
