package org.makassi.facade;

import org.makassi.facade.order_sub_system.*;

public class PurchaseFacade {
    private final OrderService orderService;
    private final PaymentService paymentService;
    private final ShippingService shippingService;
    private final NotificationService notificationService;

    // Could be injected
   public  PurchaseFacade(){
       orderService = new OrderService();
       paymentService = new PaymentService();
       shippingService = new ShippingService();
       notificationService = new NotificationService();
   }

    public void placeOrder(Order order) {
        orderService.placeOrder(order);
        paymentService.makePayment(order);
        shippingService.shipOrder(order);
        notificationService.sendNotification(order);
    }
}
