package com.jomilto.javatest.payments;

public interface PaymentGateway {
    PaymentResponse requestPayment(PaymentRequest request);
}
