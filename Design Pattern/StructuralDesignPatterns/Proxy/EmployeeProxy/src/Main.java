//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try{
            EmpTable empTable = new EmpProxy();
            empTable.createEmp("ADMIN",new EmpData());
//            empTable.createEmp("USER",new EmpData());

            empTable.deleteEmp("ADMIN",1);
//            empTable.deleteEmp("USER",2);

            empTable.getEmp("ADMIN",1);
            empTable.getEmp("USER",2);
            empTable.getEmp("ADBC",1);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
      }
}