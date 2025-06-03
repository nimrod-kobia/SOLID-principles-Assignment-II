package SRP;

// SRP.Main.java
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ryan");
        StudentPrint printer = new StudentPrint();
        printer.printStudent(student);
    }
}
