package students;

import java.util.ArrayList;

public class Student {
    private static Long id;
    public static String name;
    private  ArrayList<Integer> grades;

    public Long getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public  ArrayList<Integer> getGrades() {
        return grades;
    }

    public static void setId(Long id) {
        Student.id = id;
    }

    public static void setName(String name) {
        Student.name = name;
    }


    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int... integers)
    { for (int i : integers) {grades.add(i);} }

    public double getGradeAverage(){
       int Y = grades.size();
       double gradeTotal = 0;
        for (Integer grade : grades) {
           gradeTotal += grade;
        }
        return (gradeTotal / Y);
    }



}
