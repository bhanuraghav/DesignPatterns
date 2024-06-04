import java.util.List;

public class Student {

    int age;
    int rollNumber;
    String name;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.age = studentBuilder.age;
        this.name = studentBuilder.name;
        this.rollNumber = studentBuilder.rollNumber;
        this.subjects = studentBuilder.subjects;
    }

    public String toString() {
        return " roll number: " + this.rollNumber +
                " age: " + this.age +
                " name: " + this.name +
                " subjects: " + subjects.get(0) + "," + subjects.get(1);
    }


}
