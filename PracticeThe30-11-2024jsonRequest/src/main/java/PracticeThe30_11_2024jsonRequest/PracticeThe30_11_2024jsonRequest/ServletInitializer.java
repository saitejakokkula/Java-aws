package PracticeThe30_11_2024jsonRequest.PracticeThe30_11_2024jsonRequest;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PracticeThe30112024jsonRequestApplication.class);
	}

}
