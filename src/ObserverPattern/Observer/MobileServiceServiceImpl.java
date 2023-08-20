package ObserverPattern.Observer;

import ObserverPattern.Observable.StockService;

public class MobileServiceServiceImpl implements NotificationAlertService {

    public StockService stockService;
    public String mobile;

    public MobileServiceServiceImpl(StockService stockService, String mobile) {
        this.stockService = stockService;
        this.mobile = mobile;
    }
    @Override
    public void update() {
        sendData("Product is there in the cart, pls hurry up...Total items available: " + this.stockService.getData());
    }

    @Override
    public void sendData(String message) {
        System.out.println("Hi " + this.mobile + " " + message);
        System.out.println("Message has been sent to mobile number :" + this.mobile);
    }

}
