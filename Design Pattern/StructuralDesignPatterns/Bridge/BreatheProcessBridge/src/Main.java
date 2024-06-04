//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LivingThings fish = new FishKingdom(new WaterBreatheProcess());
        fish.breathProcess();

        LivingThings animal = new AnimalKingdom(new LandBreatheProcess());
        animal.breathProcess();


    }
}