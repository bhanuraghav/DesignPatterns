public class DocumentCharacter implements ILetter{

    Character charVal;
    String fontType;
    int fontSize;

    public DocumentCharacter(Character c, String fT , int fS){
        this.charVal = c;
        this.fontSize = fS;
        this.fontType = fT;
    }

    @Override
    public void display(int row,int col){
        System.out.println("Display character " + charVal + " at position : " + row + " : " + col);
    }
}
