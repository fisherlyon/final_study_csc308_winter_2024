package professor_example;

public class Main {

    public static void main(String[] args) {
        Professor professor = new Professor("Javier");
        String[] studentNames = {"Fisher", "Jonathan", "Leo", "Du", "Tommy", "Charles", "Bob", "Joe", "Chad", "Steve"};
        Student[] students = new Student[10];

        for (int i = 0; i < studentNames.length; i++) {
            students[i] = new Student(studentNames[i]);
        }

        professor.addNameToWhiteboard();

        for (Student student : students) {
            student.addNameToWhiteboard();
        }

        Whiteboard.getInstance().showWhiteboard();
    }
}
