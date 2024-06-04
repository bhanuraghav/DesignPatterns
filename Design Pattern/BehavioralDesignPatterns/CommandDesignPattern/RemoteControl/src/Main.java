import Command.TurnOffCommand;
import Command.TurnOnCommand;
import Invoker.InvokerRemote;
import Reciever.AcReceiver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AcReceiver acReceiver = new AcReceiver();
        InvokerRemote invokerRemote = new InvokerRemote();

        invokerRemote.setICommand(new TurnOnCommand(acReceiver));
        invokerRemote.pressButton();

        invokerRemote.setICommand(new TurnOffCommand(acReceiver));
        invokerRemote.pressButton();

        invokerRemote.undo();

    }
}