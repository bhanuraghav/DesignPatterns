package VendingMachineImplementation.VendingStates;

import VendingMachineImplementation.Coin;
import VendingMachineImplementation.Item;
import VendingMachineImplementation.VendingMachine;

import java.util.List;

public interface State {
    public void pressInsertCashButton(VendingMachine vendingMachine) throws Exception;
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;
    public void clickOnStartProductSelection(VendingMachine vendingMachine) throws Exception;
    public void chooseProduct(VendingMachine vendingMachine,int codeNumber) throws Exception;
    public Item dispenseProduct(VendingMachine vendingMachine,int codeNumber) throws Exception;
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception;
    public int getChange(int returnChangeMoney) throws Exception;
}
