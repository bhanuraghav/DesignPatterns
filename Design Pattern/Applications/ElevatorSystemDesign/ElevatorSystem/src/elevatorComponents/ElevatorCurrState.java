package elevatorComponents;

import enums.ElevatorDirection;
import enums.ElevatorStatus;

public class ElevatorCurrState {
    private int currFloor;
    private ElevatorDirection currDirection;
    private ElevatorStatus currStatus;

    public ElevatorCurrState(){
        currFloor = 0;
        currDirection = ElevatorDirection.IDLE;
        currStatus = ElevatorStatus.IDLE;
    }

    public ElevatorDirection getCurrDirection() {
        return currDirection;
    }

    public ElevatorStatus getCurrStatus() {
        return currStatus;
    }

    public int getCurrFloor() {
        return currFloor;
    }

    public void setCurrDirection(ElevatorDirection currDirection) {
        this.currDirection = currDirection;
    }

    public void setCurrFloor(int currFloor) {
        this.currFloor = currFloor;
    }

    public void setCurrStatus(ElevatorStatus currStatus) {
        this.currStatus = currStatus;
    }
}
