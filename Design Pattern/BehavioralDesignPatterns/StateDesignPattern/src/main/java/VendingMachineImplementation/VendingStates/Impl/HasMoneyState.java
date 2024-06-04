package VendingMachineImplementation.VendingStates.Impl;

import VendingMachineImplementation.Coin;
import VendingMachineImplementation.Item;
import VendingMachineImplementation.VendingMachine;
import VendingMachineImplementation.VendingStates.State;

import java.util.ArrayList;
import java.util.List;

public class HasMoneyState implements State {
    public HasMoneyState() {
        System.out.println("Currently in HAS MONEY STATE");

    }


    @Override
    public void pressInsertCashButton(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        System.out.println("Coin Accepted");
        vendingMachine.getCoinList().add(coin);
    }

    @Override
    public void clickOnStartProductSelection(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new ProductSelectionState());
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("you can not choose product in HAS MONEY STATE");

    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("you can not dispense product in HAS MONEY STATE");

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
       System.out.println("Returned the full amount");
       vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
       return vendingMachine.getCoinList();
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not return change in HAS MONEY STATE");

    }

}
