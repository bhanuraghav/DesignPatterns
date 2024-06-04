package VendingMachineImplementation;

import VendingMachineImplementation.VendingStates.Impl.IdleState;
import VendingMachineImplementation.VendingStates.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

   private State vendingMachineState;
   private List<Coin> coinList;
   private Inventory inventory;


   public VendingMachine(){
      vendingMachineState = new IdleState();
      inventory = new Inventory(10);
      coinList = new ArrayList<>();
   }

   public State getVendingMachineState() {
      return vendingMachineState;
   }

   public List<Coin> getCoinList() {
      return coinList;
   }

   public Inventory getInventory() {
      return inventory;
   }

   public void setVendingMachineState(State vendingMachineState) {
      this.vendingMachineState = vendingMachineState;
   }

   public void setCoinList(List<Coin> coinList) {
      this.coinList = coinList;
   }

   public void setInventory(Inventory inventory) {
      this.inventory = inventory;
   }
}
