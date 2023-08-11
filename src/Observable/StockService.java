package Observable;

import Observer.NotificationAlertService;

import java.util.List;
import java.util.Set;

public interface StockService {
    public void add(NotificationAlertService notificationAlertService);

    public void remove(NotificationAlertService notificationAlertService);

    public void update();

    public void setData(int stockCounts);

    public int getData();

}
