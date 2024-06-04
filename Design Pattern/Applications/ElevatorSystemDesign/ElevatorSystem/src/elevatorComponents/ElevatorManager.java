package elevatorComponents;

import java.util.HashMap;
import java.util.Map;

public class ElevatorManager {
    private static ElevatorManager elevatorManagerInstance = null;
    private Map<Integer,Elevator> elevators;


    private ElevatorManager(){
        elevators = new HashMap<>();
    }


    public static ElevatorManager getElevatorMgr(){
        if(elevatorManagerInstance==null){
            elevatorManagerInstance = new ElevatorManager();
        }
        return elevatorManagerInstance;
    }

    public void initializeElevators(int noOfElevators){
        for (int i=1;i<=noOfElevators;i++){
            elevators.put(i,new Elevator());
        }
    }

    public Elevator getElevator(int elevatorId){
        return elevators.get(elevatorId);
    }






}
