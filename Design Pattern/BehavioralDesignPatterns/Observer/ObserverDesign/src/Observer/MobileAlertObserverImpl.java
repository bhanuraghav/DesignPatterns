package Observer;

import Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String username;
    StockObservable observable;

    public MobileAlertObserverImpl(String username, StockObservable stockObservable){
        this.username= username;
        this.observable = stockObservable;
    }


    @Override
    public void update() {
        System.out.println("Mobile Notication Alert");
        System.out.println(observable);
    }
}
