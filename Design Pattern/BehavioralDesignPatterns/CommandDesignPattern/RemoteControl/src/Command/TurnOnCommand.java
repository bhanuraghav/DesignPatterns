package Command;

import Reciever.AcReceiver;

public class TurnOnCommand implements ICommand{

    AcReceiver acReceiver;

    public TurnOnCommand(AcReceiver acReceiver){
        this.acReceiver = acReceiver;
    }

    @Override
    public void undo(){
        acReceiver.turnOFFAC();
    }
    @Override
    public void execute() {
        acReceiver.turnOnAC();
    }
}
