package ObserverPattern.Observable;

import ObserverPattern.Observer.NotificationAlertService;

public interface StockService {
    public void add(NotificationAlertService notificationAlertService);

    public void remove(NotificationAlertService notificationAlertService);

    public void update();

    public void setData(int stockCounts);

    public int getData();

}
