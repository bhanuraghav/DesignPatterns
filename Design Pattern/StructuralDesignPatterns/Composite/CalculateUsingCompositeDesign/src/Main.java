//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArithmeticExpression one = new Number(1);
        ArithmeticExpression two = new Number(2);
        ArithmeticExpression seven = new Number(7);

        ArithmeticExpression addExpression = new Expression(one,seven,Operation.ADD);
        ArithmeticExpression multiExpression = new Expression(two,addExpression,Operation.MULTIPLY);

        System.out.println(multiExpression.evaluate());




    }
}