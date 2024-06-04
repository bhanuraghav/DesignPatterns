package stratergies.movementStatergy;

public class ScanAlgorithmElevatorControlStrategy implements ElevatorControlStratergy{
    @Override
    public int determineNextStop(int floorNum) {
        System.out.println("Applying Scan Algorithm and Moving elevator to floor " + floorNum);
        //returning 1 for demo purposes, should be determining next stop and returning that
        return 1;
    }
}
