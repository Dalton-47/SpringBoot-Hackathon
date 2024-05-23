package com.example.QhalaHackathon.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ModelMapperConfig {

    @Bean
    ModelMapper modelMapper()
    {
        return  new ModelMapper();
    }
}
