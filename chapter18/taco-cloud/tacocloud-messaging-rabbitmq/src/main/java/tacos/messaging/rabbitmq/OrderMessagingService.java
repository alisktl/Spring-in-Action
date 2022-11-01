package tacos.messaging.rabbitmq;

import tacos.TacoOrder;

public interface OrderMessagingService {

    void sendOrder(TacoOrder order);

}
