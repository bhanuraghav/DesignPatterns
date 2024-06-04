public class Dbc {
    private static Dbc dbc;

//    Eager Initialisation
//    private static Dbc dbc = new Dbc();


    private Dbc(){
    }

    public static Dbc getDbcUsingLazyInitialization(){
        if(dbc==null){
            dbc = new Dbc();
        }
        return dbc;
    }

    public synchronized static Dbc getDbcUsingSyncronisedMethod(){
        if(dbc==null){
            dbc = new Dbc();
        }
        return dbc;
    }

    public static Dbc getDbcUsingDoubleLocking(){
        if(dbc==null){
            synchronized (Dbc.class){
                if(dbc==null) {
                    dbc = new Dbc();
                }
            }
        }
        return dbc;
    }







}
