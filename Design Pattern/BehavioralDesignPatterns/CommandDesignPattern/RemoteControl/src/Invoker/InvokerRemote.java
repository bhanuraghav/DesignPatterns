package Invoker;

import Command.ICommand;

import java.util.Stack;

public class InvokerRemote {

    ICommand iCommand;

    Stack<ICommand> commandHistory = new Stack<>();





    public void setICommand(ICommand iCommand) {
        this.iCommand = iCommand;
    }

   public void pressButton(){
        iCommand.execute();
        commandHistory.add(iCommand);
    }


    public void undo(){
        if(!commandHistory.isEmpty()){
            ICommand lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }



}
