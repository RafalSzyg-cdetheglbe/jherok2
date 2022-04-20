package jenkinsHeroku2.jherok2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Jherok2Application {

	public static void main(String[] args) {
		SpringApplication.run(Jherok2Application.class, args);
	}

	@GetMapping
	public String get(){
		return "Hello Jenkins";
	}
}
