public class AnimalKingdom extends LivingThings {

    public AnimalKingdom(BreatheImplementer breatheImplementer){
        super(breatheImplementer);
    }

    @Override
    public void breathProcess() {
        breatheImplementer.breathe();
    }
}
