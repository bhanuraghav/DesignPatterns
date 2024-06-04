public class Director {

    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {

        if (studentBuilder instanceof EngineeringStudentBuilder) {
            return createEngineeringStudent();
        } else if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        } else return null;
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setAge(10).setName("Bhanu").setRollNumber(2).setSubjects().build();
    }

    private Student createMBAStudent() {
        return studentBuilder.setAge(12).setName("Raghav").setRollNumber(4).setSubjects().build();
    }


}
