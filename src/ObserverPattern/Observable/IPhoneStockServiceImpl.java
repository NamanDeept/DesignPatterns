package ObserverPattern.Observable;


import java.util.ArrayList;
import java.util.List;

public class IPhoneStockServiceImpl implements  StockService {
    List<Notificatio>

    List<NotificationAlertService> notificationAlertServiceList;
    int currentStockCount;

    public IPhoneStockServiceImpl(
            List<NotificationAlertService> notificationAlertServiceList,
            int currentStockCount) {
        this.notificationAlertServiceList = notificationAlertServiceList;
        this.currentStockCount = currentStockCount;
    }

    public IPhoneStockServiceImpl() {
        this.notificationAlertServiceList = new ArrayList<>();
        this.currentStockCount = 0;
    }

    @Override
    public void add(NotificationAlertService notificationAlertService) {
        this.notificationAlertServiceList.add(notificationAlertService);
    }

    @Override
    public void remove(NotificationAlertService notificationAlertService) {
        this.notificationAlertServiceList.remove(notificationAlertService);
    }

    @Override
    public void update() {
        for(NotificationAlertService notificationAlertService: this.notificationAlertServiceList) {
            notificationAlertService.update();
        }
    }

    @Override
    public void setData(int stockCounts) {
        int currentStockCount = this.getData();
        int newStockCount = currentStockCount + stockCounts;
        this.currentStockCount = newStockCount;
        if(currentStockCount == 0 && newStockCount > 0) {
            // notify all the observer regarding the update
            update();
        }

    }

    @Override
    public int getData() {
        return this.currentStockCount;
    }

}
