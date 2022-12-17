package com.ocr.webapp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration //bean use for application configuration
@ConfigurationProperties(prefix="com.ocr.webapp")
public class CustomProperties {

    private String apiUrl;
}
