package day12_map.TreeMapPractice.ComparatorDemo;


import java.util.Comparator;


public class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student firstStudent, Student secondStudent) {

        return firstStudent.getStudentName().compareTo(secondStudent.getStudentName());
    }
}