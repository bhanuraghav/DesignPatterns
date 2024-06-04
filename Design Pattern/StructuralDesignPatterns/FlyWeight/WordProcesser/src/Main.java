//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ILetter letter1 = LetterFactory.createLetter('a');
    letter1.display(1,3);


        ILetter letter2 = LetterFactory.createLetter('b');
        letter2.display(1,7);

    }
}