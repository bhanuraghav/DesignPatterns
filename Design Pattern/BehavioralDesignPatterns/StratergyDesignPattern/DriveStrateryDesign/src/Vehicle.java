import Stratergy.DriveStratergy;

public class Vehicle {

    DriveStratergy driveStratergy;

    public Vehicle(DriveStratergy driveStratergy){
        this.driveStratergy = driveStratergy;
    }


    void drive(){
        driveStratergy.drive();
    }


}
