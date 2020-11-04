package io.github.sughas.OpenLibaryApiIntergrartion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages = { "io.github.sughas.OpenLibaryApiIntergrartion.*"})
public class OpenLibaryApiIntergrartionApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenLibaryApiIntergrartionApplication.class, args);
	}
	@Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }

}
