package Adapter;
import Adaptee.WeightMachine;
public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }


    @Override
    public double getWeightInKG() {
        return weightMachine.getWeightInPounds()*1.5;
    }
}
