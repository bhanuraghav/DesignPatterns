package internalRequest;

import elevatorComponents.Elevator;
import elevatorComponents.ElevatorManager;

public class InternalRequestsProcessor {

    public void processInternalRequest(InternalRequest intReq) {
        ElevatorManager elevatorMgr = ElevatorManager.getElevatorMgr();
        Elevator srcElevator = elevatorMgr.getElevator(intReq.getSrcElevatorId());
        srcElevator.moveToFloor(intReq.getDestFloor());
    }


}
