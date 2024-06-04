import Caretaker.ConfigurationCaretaker;
import Memento.ConfigurationMemento;
import Originator.ConfigurationOriginator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConfigurationCaretaker caretakerObj = new ConfigurationCaretaker();

        ConfigurationOriginator originatorObj = new ConfigurationOriginator(5,10);

        ConfigurationMemento snapshot1 = originatorObj.createMemento();
        caretakerObj.addMemento(snapshot1);

        originatorObj.setHeight(12);
        originatorObj.setWidth(15);

        ConfigurationMemento snapshot2 = originatorObj.createMemento();
        caretakerObj.addMemento(snapshot2);

        originatorObj.setWidth(16);
        originatorObj.setHeight(18);


        ConfigurationMemento restoreLastMemento = caretakerObj.undo();
        originatorObj.restoreMemento(restoreLastMemento);


        System.out.println(originatorObj.getHeight() + " --- "  + originatorObj.getWidth() );






    }
}