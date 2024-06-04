package VendingMachineImplementation.VendingStates.Impl;

import VendingMachineImplementation.Coin;
import VendingMachineImplementation.Item;
import VendingMachineImplementation.VendingMachine;
import VendingMachineImplementation.VendingStates.State;

import java.util.ArrayList;
import java.util.List;

public class DispenseState implements State {
    public DispenseState(){
        System.out.println("Currently in DISPENSE STATE");
    }

    public DispenseState(VendingMachine vendingMachine,int codeNumber) throws Exception{
        System.out.println("Currently in DISPENSE STATE");
        dispenseProduct(vendingMachine,codeNumber);
    }

    @Override
    public void pressInsertCashButton(VendingMachine vendingMachine) throws Exception{
        throw new Exception("you can not press insert cash button in DISPENSE STATE");

    }
    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception{
        throw new Exception("you can not insert coin in DISPENSE STATE");
    }
    @Override
    public void clickOnStartProductSelection(VendingMachine vendingMachine) throws Exception{
        throw new Exception("you can not select product in DISPENSE STATE");

    }
    @Override
    public void chooseProduct(VendingMachine vendingMachine,int codeNumber) throws Exception{
        throw new Exception("you can not choose product in DISPENSE STATE");

    }
    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception{
        System.out.println("System has been dispensed");
        Item item  = vendingMachine.getInventory().getItem(codeNumber);
        vendingMachine.getInventory().updateSoldOutItem(codeNumber);

        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));

        return item;

    }
    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception{
        throw new Exception("you can not refund money in DISPENSE STATE");

    }
    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not return change in DISPENSE STATE");

    }

}
