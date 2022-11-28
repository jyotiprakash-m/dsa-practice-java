package oops;

import java.util.Arrays;

public class CopyContructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        int[] marks1 = { 7, 8, 9 };
        s1.setName("Jyoti");
        s1.setAge(14);
        s1.setMarks(marks1);
        
        Student s2 = new Student(s1);
        int[] marks2 = { 10, 8, 7 };
        s2.setName("Prakash");
        s2.setMarks(marks2);
        Student.setSchool("ABC");
        System.out.println(s1.toString()+"  "+Student.getSchool());
        System.out.println(s2.toString()+"  "+s2.getSchool());
    }
}

class Student {
    private String name;
    private int age;
    private static String school = "SVM";
    private int[] marks;

    Student() {
        System.out.println("Constuctor called");
    }

    Student(Student s) {
        int[] marks = new int[s.marks.length];
        this.name = s.name;
        this.age = s.age;
        // Copy constructor is useful when we have object and array property.
        for (int i = 0; i < s.marks.length; i++) {
            marks[i] = s.marks[i];
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", marks=" + Arrays.toString(marks) + "]";
    }
    

}