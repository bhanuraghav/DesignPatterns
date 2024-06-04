package Observer;

import Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;
    StockObservable observable;

    public EmailAlertObserverImpl(String emailId,StockObservable stockObservable){
        this.emailId = emailId;
        this.observable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Email Notication Alert");
        System.out.println(emailId);
    }
}
