package VendingMachineImplementation.VendingStates.Impl;

import VendingMachineImplementation.Coin;
import VendingMachineImplementation.Item;
import VendingMachineImplementation.VendingMachine;
import VendingMachineImplementation.VendingStates.State;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements State {
    public IdleState(){
        System.out.println("Currently in IDLE STATE");
    }

    public IdleState( VendingMachine vendingMachine){
        System.out.println("Currently in IDLE STATE");
        vendingMachine.setCoinList(new ArrayList<>());
    }

    @Override
    public void pressInsertCashButton(VendingMachine vendingMachine) throws Exception{
        vendingMachine.setVendingMachineState(new HasMoneyState());
    }
    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception{
        throw new Exception("you can not insert coin in idle state");
    }
    @Override
    public void clickOnStartProductSelection(VendingMachine vendingMachine) throws Exception{
        throw new Exception("you can not select product in idle state");

    }
    @Override
    public void chooseProduct(VendingMachine vendingMachine,int codeNumber) throws Exception{
        throw new Exception("you can not choose product in idle state");

    }
    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception{
        throw new Exception("you can not dispense product in idle state");

    }
    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception{
        throw new Exception("you can not refund money in idle state");

    }
    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not return change in idle state");

    }

}
