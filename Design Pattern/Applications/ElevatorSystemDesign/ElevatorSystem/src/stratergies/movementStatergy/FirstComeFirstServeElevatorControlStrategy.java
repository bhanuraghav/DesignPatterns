package stratergies.movementStatergy;

public class FirstComeFirstServeElevatorControlStrategy implements ElevatorControlStratergy{

    @Override
    public int determineNextStop(int floorNum) {
        System.out.println("Applying First Come First Serve Algorithm and Moving elevator to floor " + floorNum);
        //returning 1 for demo purposes, should be determining next stop and returning that
        return 1;
    }


}
