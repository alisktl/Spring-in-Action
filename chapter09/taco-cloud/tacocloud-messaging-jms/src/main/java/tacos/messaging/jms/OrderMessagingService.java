package tacos.messaging.jms;

import tacos.TacoOrder;

public interface OrderMessagingService {

    void sendOrder(TacoOrder order);

}
