package br.edu.ifpb.padroes.payment.processors;

import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.payment.PaymentProcessor;
import br.edu.ifpb.padroes.payment.PaymentProcessorHandler;

public class GovernmentTaxesPayment extends PaymentProcessor {

    public GovernmentTaxesPayment(PaymentProcessorHandler next) {
        super(next);
    }

    @Override
    public void process(Property property) {
        double governmentTaxes = property.getPrice()*0.05;
        System.out.println(String.format("Pay %f for government taxes", governmentTaxes));
        
        if (getNext() != null) {
            getNext().process(property);
        }
    }
}

