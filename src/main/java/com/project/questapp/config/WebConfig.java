package com.project.questapp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000") // İzin verilen kaynak URL'leri
                .allowedMethods("GET", "POST", "PUT", "DELETE") // İzin verilen HTTP metotları
                .allowCredentials(true); // Kimlik bilgisiyle isteklerin kabul edilmesi
    }
}
