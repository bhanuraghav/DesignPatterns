public class EmpImpl implements EmpTable {

    @Override
    public void createEmp(String client, EmpData empData) throws Exception{
        System.out.println("Create Emp Table");
    }

    @Override
    public void getEmp(String client, int empId) throws Exception{
        System.out.println("get Emp Table");
    }

    @Override
    public void deleteEmp(String client, int empId) throws Exception{
        System.out.println("delete Emp Table");
    }



}
