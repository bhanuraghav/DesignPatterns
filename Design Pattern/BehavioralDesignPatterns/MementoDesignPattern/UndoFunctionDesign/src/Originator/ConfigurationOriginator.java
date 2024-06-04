package Originator;

import Memento.ConfigurationMemento;

public class ConfigurationOriginator {

    int height;
    int width;

    public ConfigurationOriginator(int height,int width){
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public ConfigurationMemento createMemento(){
        return new ConfigurationMemento(this.height,this.width);
    }

    public void restoreMemento(ConfigurationMemento configurationMemento){
        this.width = configurationMemento.getWidth();
        this.height = configurationMemento.getHeight();
    }





}

