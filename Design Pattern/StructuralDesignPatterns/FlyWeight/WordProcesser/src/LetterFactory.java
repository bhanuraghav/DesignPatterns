import java.util.HashMap;
import java.util.Map;

public class LetterFactory {


    private static Map<Character,ILetter> characterCache = new HashMap<>();

    public static ILetter createLetter(char charVal){
        if(characterCache.containsKey(charVal)){
            return characterCache.get(charVal);
        }
        else{
            DocumentCharacter characterobj = new DocumentCharacter(charVal, "Arial", 10);
            characterCache.put(charVal,characterobj);

            return characterobj;

        }
    }
}
