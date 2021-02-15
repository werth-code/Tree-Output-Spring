package werth.matt.SimpleSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;

@SpringBootApplication
public class SimpleSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringApplication.class, args);

		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}