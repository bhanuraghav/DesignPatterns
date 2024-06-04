//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Director directorObj1 = new Director(new EngineeringStudentBuilder());
        Director directorobj2 = new Director(new MBAStudentBuilder());

        Student engineerStudent =  directorObj1.createStudent();
        Student mbaStudent =  directorobj2.createStudent();

        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());


    }
}