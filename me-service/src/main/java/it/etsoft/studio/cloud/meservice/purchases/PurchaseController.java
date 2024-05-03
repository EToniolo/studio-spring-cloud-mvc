package it.etsoft.studio.cloud.meservice.purchases;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@ResponseBody
@Slf4j
public class PurchaseController {
  private final PurchaseService purchaseService;

    PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @PostMapping("/purchases")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    Integer place(@RequestBody Purchase purchase, Principal principal) {
        log.info("{} for user {}", purchase, principal.getName());
        
        return this.purchaseService.place(principal.getName(), purchase.productId(), purchase.quantity());
    }
}
