package Command;

import Reciever.AcReceiver;

public class TurnOffCommand implements ICommand{

    AcReceiver acReceiver;

    public TurnOffCommand(AcReceiver acReceiver){
        this.acReceiver = acReceiver;
    }

    @Override
    public void undo(){
        acReceiver.turnOnAC();
    }


    @Override
    public void execute() {
        acReceiver.turnOFFAC();
    }
}
