public class FishKingdom extends LivingThings {

    public FishKingdom(BreatheImplementer breatheImplementer){
        super(breatheImplementer);
    }

    @Override
    public void breathProcess() {
        breatheImplementer.breathe();
    }
}
