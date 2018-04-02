package com.alic.config;

import com.sun.javafx.css.StringStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * spring配置类
 *
 * @author suxingzhe
 * @create 2018-03-27 上午11:33
 **/
@Configuration
public class MovieConfiguration {
    @Bean
    public StringStore stringStore() {
        return new StringStore();
    }
    /*@Bean
    @Primary
    public MovieCatalog firstMovieCatalog() { ... }

    @Bean
    public MovieCatalog secondMovieCatalog() { ... }*/
}
