package br.edu.ifpb.padroes.payment;

import br.edu.ifpb.padroes.domain.Property;
import br.edu.ifpb.padroes.payment.processors.GovernmentTaxesPayment;
import br.edu.ifpb.padroes.payment.processors.PropertyPayment;
import br.edu.ifpb.padroes.payment.processors.RealEstatePayment;

public class PaymentService {

    public void pay(Property sale) {
        GovernmentTaxesPayment governmentTaxesPayment = new GovernmentTaxesPayment(null);
        RealEstatePayment realEstatePayment = new RealEstatePayment(governmentTaxesPayment);
        PropertyPayment propertyPayment = new PropertyPayment(realEstatePayment);

        // TODO - implementar Chain of Responsibility para que ordem dos métodos de pagamento seja dinâmica (definida em tempo de execução)

        propertyPayment.process(sale);

    }

}
