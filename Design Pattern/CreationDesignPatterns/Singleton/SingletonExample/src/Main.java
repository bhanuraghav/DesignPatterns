//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dbc  dbc = Dbc.getDbcUsingLazyInitialization();
        Dbc  dbc2 = Dbc.getDbcUsingLazyInitialization();

        System.out.println(dbc.hashCode());
        System.out.println(dbc2.hashCode());


    }
}