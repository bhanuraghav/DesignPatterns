package elevatorComponents;

import enums.ElevatorDirection;
import externalRequest.ExternalRequest;
import externalRequest.ExternalRequestsProcessor;
import internalRequest.InternalRequest;
import internalRequest.InternalRequestsProcessor;
import stratergies.selectionStratergy.ElevatorSelectionStrategy;

public class ElevatorSystem {

    private static ElevatorSystem elevatorSystemInstance = null;
    private int noOfFloors;
    private int noOfElevators;
    private ExternalRequestsProcessor extReqProcessor;
    private InternalRequestsProcessor intReqProcessor;


    private ElevatorSystem(){
    }

    public static ElevatorSystem getElevatorSystem(){
        if(elevatorSystemInstance==null){
            elevatorSystemInstance = new ElevatorSystem();
        }
        return elevatorSystemInstance;
    }


    public void initializeElevatorSystem(int inputNoOfFloors,int inputNoOfElevators){
        noOfElevators= inputNoOfElevators;
        noOfFloors = inputNoOfFloors;

        System.out.println("Initializing elevator system with " + noOfFloors + " floors and " + noOfElevators + " elevators!");
        System.out.println("--------------------------------------------------------");

        // Initialize elevatorComponents.Elevator Manager
        ElevatorManager elevatorManager = ElevatorManager.getElevatorMgr();
        elevatorManager.initializeElevators(noOfElevators);

        // Initialize requests processors
        extReqProcessor = new ExternalRequestsProcessor();
        intReqProcessor = new InternalRequestsProcessor();
    }

    public void setElevatorSelectionStrategy(ElevatorSelectionStrategy selectionStrategy) {
        extReqProcessor.setElevatorSelectionStrategy(selectionStrategy);
    }

    public void sendExternalRequest(ElevatorDirection direction, int srcFloor) {
        extReqProcessor.processExternalRequest(new ExternalRequest(direction, srcFloor));
    }

    public void sendInternalRequest(int destFloor, int srcElevatorId) {
        intReqProcessor.processInternalRequest(new InternalRequest(destFloor, srcElevatorId));
    }

}
