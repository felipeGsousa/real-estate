package br.edu.ifpb.padroes.payment;

public abstract class PaymentProcessor implements PaymentProcessorHandler {

    private PaymentProcessorHandler next;

    public PaymentProcessor(PaymentProcessorHandler next) {
        this.next = next;
    }

    public PaymentProcessorHandler getNext() {
        return next;
    }

    public void setNext(PaymentProcessorHandler next) {
        this.next = next;
    }

}
