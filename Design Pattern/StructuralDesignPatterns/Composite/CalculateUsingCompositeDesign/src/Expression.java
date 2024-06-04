public class Expression implements ArithmeticExpression {

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    public Expression(ArithmeticExpression leftP, ArithmeticExpression rightP, Operation operation) {
        this.leftExpression = leftP;
        this.rightExpression = rightP;
        this.operation = operation;
    }


    @Override
    public int evaluate() {
        int value = 0;
        switch (operation) {
            case Operation.ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case Operation.SUBTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
            case Operation.MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
            case Operation.DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;


        }
        System.out.println("Expression value is :" + value);
        return value;
    }


}
