package SpringbootRequestPerameter30_11_2024.SpringbootRequestPerameter30_11_2024;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootRequestPerameter30112024Application.class);
	}

}
