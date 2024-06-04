
public class NumberTerminalExpression implements AbstractExpression{

    String value;

    public NumberTerminalExpression(String val){
        this.value= val;
    }


    @Override
    public int interpret(Context context) {
        return context.get(value);
    }
}
