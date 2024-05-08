package it.etsoft.studio.cloud.gateway.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "gateway")
@Configuration
public class GatewayParams {

    private GatewayHostParams api;
    private GatewayHostParams ui;

}
