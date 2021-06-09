package you.shall.not.pass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class AccessGateApp {

	public static void main(String[] args) {
		SpringApplication.run(AccessGateApp.class, args);
	}

}
