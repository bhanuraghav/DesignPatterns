import Adaptee.WeightMachineImpl;
import Adapter.WeightMachineAdapter;
import Adapter.WeightMachineAdapterImpl;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineImpl());
        System.out.println(weightMachineAdapter.getWeightInKG());


    }
}