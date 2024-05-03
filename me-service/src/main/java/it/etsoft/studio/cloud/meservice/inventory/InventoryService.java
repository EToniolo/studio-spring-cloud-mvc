package it.etsoft.studio.cloud.meservice.inventory;

import org.springframework.context.event.EventListener;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Service;

import it.etsoft.studio.cloud.meservice.purchases.PurchasePlacedEvent;
import lombok.extern.slf4j.Slf4j;

@Service
@EnableAsync
@Slf4j
public class InventoryService {

    @EventListener
    @ApplicationModuleListener
    void purchasePlacedEvent(PurchasePlacedEvent purchasePlacedEvent) throws Exception {
        log.info("got an event: {}", purchasePlacedEvent);
        Thread.sleep(20_000);
    }

}
