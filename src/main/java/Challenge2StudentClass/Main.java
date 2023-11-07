package Challenge2StudentClass;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName());
        student.setName("Samantha");
        String studentName = student.getName();
        System.out.println(studentName);

        System.out.println(student.getRollNumber());
        student.setRollNumber("3433");
        String student_rollNumber = student.getRollNumber();
        System.out.println(student_rollNumber);
    }
}
