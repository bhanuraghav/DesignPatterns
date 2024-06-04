public abstract class LivingThings {
    BreatheImplementer breatheImplementer;

    public LivingThings(BreatheImplementer breatheImplementer){
        this.breatheImplementer = breatheImplementer;
    }

    abstract public void breathProcess();




}
