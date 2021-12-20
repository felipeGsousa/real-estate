package br.edu.ifpb.padroes.payment.processors;

import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.payment.PaymentProcessor;
import br.edu.ifpb.padroes.payment.PaymentProcessorHandler;

public class RealEstatePayment extends PaymentProcessor {

    public RealEstatePayment(PaymentProcessorHandler next) {
        super(next);
    }

    @Override
    public void process(Property property) {
        double realStateComission = property.getPrice()*0.10;
        System.out.println(String.format("Pay %f for real state", realStateComission));

        if (getNext() != null) {
            getNext().process(property);
        }
    }
}

