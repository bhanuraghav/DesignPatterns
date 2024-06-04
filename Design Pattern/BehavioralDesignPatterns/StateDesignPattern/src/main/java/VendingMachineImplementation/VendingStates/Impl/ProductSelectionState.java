package VendingMachineImplementation.VendingStates.Impl;

import VendingMachineImplementation.Coin;
import VendingMachineImplementation.Item;
import VendingMachineImplementation.VendingMachine;
import VendingMachineImplementation.VendingStates.State;

import java.util.ArrayList;
import java.util.List;

public class ProductSelectionState implements State {
    public ProductSelectionState() {
        System.out.println("Currently in PRODUCT SELECTION STATE");
    }

    public ProductSelectionState(VendingMachine vendingMachine) {
        System.out.println("Currently in ProductSelectionState");
        vendingMachine.setCoinList(new ArrayList<>());
    }

    @Override
    public void pressInsertCashButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception("you can not press insert coin button in ProductSelectionState");
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new Exception("you can not insert coin in ProductSelectionState");
    }

    @Override
    public void clickOnStartProductSelection(VendingMachine vendingMachine) throws Exception {
        return;
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {

        Item item = vendingMachine.getInventory().getItem(codeNumber);

        int amountPaidByUser = 0;

        for (Coin c : vendingMachine.getCoinList()) {
            amountPaidByUser += c.value;
        }

        if (amountPaidByUser < item.getPrice()) {
            System.out.println("Insufficient amount paid");
            System.out.println("Amount reqd.  : " + item.getPrice() + " and the amount paid = " + amountPaidByUser);
            refundFullMoney(vendingMachine);
            throw new Exception("Insufficient amount paid");
        } else if (amountPaidByUser > item.getPrice()) {
            getChange(amountPaidByUser - item.getPrice());
            vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, codeNumber));
        } else {
            vendingMachine.setVendingMachineState(new DispenseState(vendingMachine, codeNumber));
        }

    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("you can not dispense product in ProductSelectionState");

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("Returned the full amount");
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        return vendingMachine.getCoinList();
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("Change refunded of amount : " + returnChangeMoney);
        return returnChangeMoney;
    }

}
