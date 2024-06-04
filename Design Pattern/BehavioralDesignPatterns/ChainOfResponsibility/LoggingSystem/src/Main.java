//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LogProcessor logObj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObj.log(LogProcessor.ERROR,"exception error");
        logObj.log(LogProcessor.DEBUG,"exception DEBUG");
        logObj.log(LogProcessor.INFO,"exception INFO");


    }
}