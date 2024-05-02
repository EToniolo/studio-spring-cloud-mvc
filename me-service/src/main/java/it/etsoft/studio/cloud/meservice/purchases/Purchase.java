package it.etsoft.studio.cloud.meservice.purchases;

import org.springframework.data.annotation.Id;

public record Purchase(@Id Integer id, String username, Integer productId, int quantity) {
}
