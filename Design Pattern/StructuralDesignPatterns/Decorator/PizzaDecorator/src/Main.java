//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BasePizza mushroomExtraCheeseNonVegLoadedPizza = new Mushroom(new ExtraCheese(new NonVegLoaded()));

        System.out.println(mushroomExtraCheeseNonVegLoadedPizza.cost());

    }

}