package it.etsoft.studio.cloud.meservice.purchases;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class PurchaseService {

    private final PurchaseRespository       purchaseRespository;
    private final ApplicationEventPublisher publisher;


    Integer place(String currentCustomerUsername, Integer productId, int quantity) {
        var purchase = this.purchaseRespository.save(new Purchase(null, currentCustomerUsername, productId, quantity));

        this.publisher.publishEvent(new PurchasePlacedEvent(
                purchase.id(),
                purchase.username(),
                purchase.productId(),
                purchase.quantity()
        ));
        
        return purchase.id();
    }
}
