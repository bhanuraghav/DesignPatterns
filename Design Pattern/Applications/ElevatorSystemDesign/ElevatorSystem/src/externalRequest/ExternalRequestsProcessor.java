package externalRequest;

import elevatorComponents.Elevator;
import elevatorComponents.ElevatorManager;
import stratergies.selectionStratergy.ElevatorSelectionStrategy;
import stratergies.selectionStratergy.OddEvenElevatorSelStrategy;

public class ExternalRequestsProcessor {

    private ElevatorSelectionStrategy elevatorSelectionStrategy;

    public ExternalRequestsProcessor() {
        // Setting default elevator selection strategy
        elevatorSelectionStrategy = new OddEvenElevatorSelStrategy();
    }

    public void setElevatorSelectionStrategy(ElevatorSelectionStrategy elevatorSelectionStrategy){
        this.elevatorSelectionStrategy = elevatorSelectionStrategy;
    }

    public void processExternalRequest(ExternalRequest externalRequest){

        int assignedElevatorId = elevatorSelectionStrategy.selectElevator(externalRequest);
        ElevatorManager elevatorManager = ElevatorManager.getElevatorMgr();
        Elevator assignedElevator = elevatorManager.getElevator(assignedElevatorId);
        assignedElevator.moveToFloor(externalRequest.getSrcFloor());






    }








}
