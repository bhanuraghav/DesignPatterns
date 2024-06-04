package Caretaker;

import Memento.ConfigurationMemento;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCaretaker {

    List<ConfigurationMemento> history = new ArrayList<>();

    public void addMemento(ConfigurationMemento configurationMemento){
        history.add(configurationMemento);
    }

    public ConfigurationMemento undo(){
        if(!history.isEmpty()){
            int lastIndex = history.size() -1;
            ConfigurationMemento lastMemento = history.get(lastIndex);
            history.remove(lastIndex);

            return lastMemento;


        }
        return null;
    }








}
