import Observable.IphoneStockObservableImpl;
import Observable.StockObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StockObservable iphoneStockObservable = new IphoneStockObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl("abc@8010",iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserverImpl("xyz@gmail.com",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(5);









    }
}