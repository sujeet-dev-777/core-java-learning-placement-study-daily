package day12_map.TreeMapPractice.comparableDemo;

public class Student implements Comparable<Student> {

    private int rollNumber;
    private String studentName;

    public Student(int rollNumber, String studentName) {
        this.rollNumber = rollNumber;
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.rollNumber, otherStudent.rollNumber);
    }

    @Override
    public String toString() {
        return rollNumber + " - " + studentName;
    }
}