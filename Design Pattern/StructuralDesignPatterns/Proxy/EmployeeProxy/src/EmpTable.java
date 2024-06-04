public interface EmpTable {

    public void createEmp(String client, EmpData empData) throws Exception;
    public void getEmp(String client, int empId) throws Exception;
    public void deleteEmp(String client, int empId) throws Exception;

}
