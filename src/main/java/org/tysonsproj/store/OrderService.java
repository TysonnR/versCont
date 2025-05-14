package org.tysonsproj.store;

public class OrderService
{
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }
    public void placeOrder() {
        //with tight coupling
        //var paymentService = new StripePaymentService();
        //paymentService.processPayment(10.0);

        //with loose coupling
        paymentService.processPayment(10.0);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
}
