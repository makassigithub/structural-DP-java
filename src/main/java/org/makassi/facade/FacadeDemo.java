package org.makassi.facade;

import org.makassi.facade.order_sub_system.Order;

public class FacadeDemo {
    public static void main(String ...args){
       PurchaseFacade purchaseFacade = new PurchaseFacade();
       Order order = new Order("Laptop", 1000);
       purchaseFacade.placeOrder(order);
    }
}
