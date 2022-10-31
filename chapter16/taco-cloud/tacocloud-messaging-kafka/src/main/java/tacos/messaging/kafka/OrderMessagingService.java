package tacos.messaging.kafka;

import tacos.TacoOrder;

public interface OrderMessagingService {

    void sendOrder(TacoOrder order);

}
