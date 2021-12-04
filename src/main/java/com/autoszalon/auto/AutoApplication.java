package com.autoszalon.auto;

import com.autoszalon.auto.application.service.Testdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoApplication.class, args);
	}
        
        @Autowired
        private Testdata testdata;
        
        
        @Bean
        public CommandLineRunner commandLineRunner(ApplicationContext ctx) { 
        return args -> {
        	testdata.Createdata();
            
        }; 
    } 

}
