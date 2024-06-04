package elevatorComponents;

public class Elevator {

    private int elevatorId;
    private ElevatorController elevatorController;

    public Elevator(){
        elevatorController = new ElevatorController();
    }

    public int getElevatorId() {
        return elevatorId;
    }

    public void moveToFloor(int floorNum) {
        elevatorController.moveElevatorToFloor(floorNum);
    }

    public void notifyFloorNumUpdate(int floorNum) {
        elevatorController.setCurrFloor(floorNum);
    }





}
