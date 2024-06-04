import java.util.List;

public abstract class StudentBuilder {


    int rollNumber;
    int age;
    String name;

    List<String> subjects;

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public StudentBuilder setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    abstract public StudentBuilder setSubjects();


    public Student build(){
        return new Student(this);
    }





}
