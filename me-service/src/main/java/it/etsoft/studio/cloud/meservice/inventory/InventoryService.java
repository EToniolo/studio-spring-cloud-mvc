package it.etsoft.studio.cloud.meservice.inventory;

import org.springframework.context.event.EventListener;
import org.springframework.modulith.ApplicationModuleListener;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import it.etsoft.studio.cloud.meservice.purchases.PurchasePlacedEvent;

@Service
@EnableAsync
public class InventoryService {


    @EventListener
    @ApplicationModuleListener
    void purchasePlacedEvent(PurchasePlacedEvent purchasePlacedEvent) throws Exception {
        System.out.println("got an event " + purchasePlacedEvent);
        Thread.sleep(20_000);
    }

}
