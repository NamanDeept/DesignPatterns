package Observer;

import Observable.IPhoneStockServiceImpl;
import Observable.StockService;

public class EmailServiceServiceImpl implements NotificationAlertService {

    public StockService stockService;
    public String emailId;

    public EmailServiceServiceImpl(IPhoneStockServiceImpl stockService, String email) {
        this.stockService = stockService;
        this.emailId = email;
    }
    @Override
    public void update() {
        this.sendData("Product is there in the cart, pls hurry up...Total items available: " + this.stockService.getData());
    }

    @Override
    public void sendData(String message) {
        System.out.println("Hi " + this.emailId + " " + message);
        System.out.println("Message Sent to emailId :" + this.emailId);
    }

}
