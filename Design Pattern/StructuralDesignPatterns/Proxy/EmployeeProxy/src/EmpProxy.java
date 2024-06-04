public class EmpProxy implements EmpTable {
    EmpTable empObj;


    public EmpProxy() {
        empObj = new EmpImpl();
    }


    @Override
    public void createEmp(String client, EmpData empData) throws Exception {

        if (client.equals("ADMIN")) {
            empObj.createEmp(client, empData);
            return;
        }

        throw new Exception("Access Denied");
    }

    @Override
    public void getEmp(String client, int empId) throws Exception {
        if (client.equals("ADMIN")|| client.equals("USER")) {
            empObj.getEmp(client, empId);
            return;
        }

        throw new Exception("Access Denied");
    }

    @Override
    public void deleteEmp(String client, int empId) throws Exception {
        if (client.equals("ADMIN")) {
            empObj.deleteEmp(client, empId);
            return;
        }

        throw new Exception("Access Denied");
    }
}
