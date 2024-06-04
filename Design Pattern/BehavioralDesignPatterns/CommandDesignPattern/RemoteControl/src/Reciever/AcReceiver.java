package Reciever;

public class AcReceiver {

    boolean isOn;
    int temp;


    public void turnOnAC(){
        isOn=true;
        System.out.println("Turn On AC");
    }

    public void turnOFFAC(){
        isOn = false;
        System.out.println("Turn Off AC");
    }

    public void setTemp(int temp) {
        this.temp = temp;
        System.out.println("Set temp to : " + temp);
    }


}
