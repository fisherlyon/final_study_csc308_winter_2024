package professor_example;

import java.util.ArrayList;

public class Whiteboard {
    private static Whiteboard instance;
    private ArrayList<String> names = new ArrayList<>();

    protected Whiteboard() {
    }

    public static Whiteboard getInstance() {
        if (instance == null) {
            instance = new Whiteboard();
        }
        return instance;
    }

    public void addName(String name) {
        names.add(name);
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void showWhiteboard() {
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
