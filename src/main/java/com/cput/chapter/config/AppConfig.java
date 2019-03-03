package com.cput.chapter.config;

import com.cput.chapter.TechShopInterface;
import com.cput.chapter.TechShopStock;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean (name  = "tech")
    public TechShopInterface getVal()
    {
        return new TechShopStock();
    }
}
