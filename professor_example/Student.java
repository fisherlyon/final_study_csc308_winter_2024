package professor_example;

public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addNameToWhiteboard() {
        Whiteboard.getInstance().addName(this.name);
    }

    @Override
    public void update(Observable observable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }
}
