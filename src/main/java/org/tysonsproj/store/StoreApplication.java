package org.tysonsproj.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication
{

    public static void main(String[] args) {
     //   SpringApplication.run(StoreApplication.class, args);
<<<<<<< HEAD
        var orderService = new OrderService(new PayPalPaymentService());
=======
        var orderService = new OrderService(new StripePaymentService());
>>>>>>> 85f317db25d6ad90f0bbd15cd45cba28ec7e6703
        orderService.placeOrder();
    }

}
