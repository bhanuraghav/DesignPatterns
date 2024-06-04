//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        NetworkConnection n1 = new NetworkConnection();

        System.out.println("Create objs : ");

        n1.setIp("192.1.1.1");
        n1.loadVeryImpData();
        System.out.println(n1);

        try{
            NetworkConnection n2 = (NetworkConnection) n1.clone();
            System.out.println(n2 );

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }


    }
}