import Observable.IPhoneStockServiceImpl;
import Observer.EmailServiceServiceImpl;
import Observer.MobileServiceServiceImpl;
import Observer.NotificationAlertService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        IPhoneStockServiceImpl iPhoneStocks = new IPhoneStockServiceImpl();
        NotificationAlertService emailUser1 = new EmailServiceServiceImpl(iPhoneStocks, "naman@gmail.com");
        NotificationAlertService emailUser2 = new EmailServiceServiceImpl(iPhoneStocks, "nd@gmail.com");
        NotificationAlertService emailUser3 = new EmailServiceServiceImpl(iPhoneStocks, "deeptnaman@gmail.com");
        NotificationAlertService mobileUser1 = new MobileServiceServiceImpl(iPhoneStocks, "6200989298");

        iPhoneStocks.add(emailUser1);
        iPhoneStocks.add(emailUser2);
        iPhoneStocks.add(emailUser3);
        iPhoneStocks.add(mobileUser1);

        iPhoneStocks.setData(10);
    }
}