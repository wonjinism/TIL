package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	private static final Logger log = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
	
	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			repository.save(new Customer("Wonjin", "Kim"));
			repository.save(new Customer("Simon", "Kim"));
			repository.save(new Customer("Seonhyang", "Byeon"));
			repository.save(new Customer("Sonya", "Byeon"));
			repository.save(new Customer("Hyunjin", "Kim"));
			
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			for (Customer customer : repository.findAll()) {
				log.info(customer.toString());
			}
			log.info("");
			
			repository.findById(1L).ifPresent(customer -> {
				log.info("Customer found with findById(1L):");
				log.info("---------------------------------");
				log.info(customer.toString());
				log.info("");
			});
			
			log.info("Customer found with findByLastName('Byeon'):");
			log.info("--------------------------------------------");
			repository.findByLastName("Byeon").forEach(byeon -> {
				log.info(byeon.toString());
			});
			
			log.info("");
		};
	}
}
