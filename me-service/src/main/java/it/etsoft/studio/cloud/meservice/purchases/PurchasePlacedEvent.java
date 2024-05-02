package it.etsoft.studio.cloud.meservice.purchases;

public record PurchasePlacedEvent(Integer purchaseId, String username, Integer productId, int quantity) {
}
