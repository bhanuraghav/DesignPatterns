import java.util.HashMap;
import java.util.Map;

public class Context {

    Map<String, Integer> contextMap = new HashMap<>();

    public void put(String str,int val){
        contextMap.put(str,val);
    }

    public int get(String str){
        return contextMap.get(str);
    }






}
