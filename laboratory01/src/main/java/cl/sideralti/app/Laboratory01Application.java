package cl.sideralti.app;

import cl.sideralti.app.service.AuthorStoreService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Laboratory01Application {

	public final AuthorStoreService authorStoreService;

	public Laboratory01Application(AuthorStoreService authorStoreService) {
		this.authorStoreService = authorStoreService;
	}

	public static void main(String[] args) {
		SpringApplication.run(Laboratory01Application.class, args);
	}

	@Bean
	public ApplicationRunner init() {
		return args -> {
			authorStoreService.persistNewAuthor();
			authorStoreService.fetchAuthor();
			authorStoreService.fetchAllAuthor();
		};
	}

}
