package elevatorComponents;

import enums.ElevatorDirection;
import enums.ElevatorStatus;
import stratergies.movementStatergy.*;

public class ElevatorController {
    private ElevatorCurrState state;
    private ElevatorControlStratergy controlStatergy;


    public ElevatorController(){
        state =  new ElevatorCurrState();
    }

    void setCurrFloor(int floorNum) {
        //Controller should check if this is stopping point
        //If yes, should stop using stop method
        state.setCurrFloor(floorNum);
    }

    public void moveElevatorToFloor(int floorNum){
        controlStatergy = new FirstComeFirstServeElevatorControlStrategy();

        //We are just determining the nex stop as when requests come
        //The movement is being taken by hardware.
        //Controller sees the next stop and tells hardware move to this floor
        int nextStop = controlStatergy.determineNextStop(floorNum);

        if(nextStop>state.getCurrFloor()){
            state.setCurrDirection(ElevatorDirection.UP);
        }else if (nextStop<state.getCurrFloor()){
            state.setCurrDirection(ElevatorDirection.DOWN);
        }

        if(nextStop!= state.getCurrFloor()){
            state.setCurrStatus(ElevatorStatus.MOVING);
        }











    }




}
