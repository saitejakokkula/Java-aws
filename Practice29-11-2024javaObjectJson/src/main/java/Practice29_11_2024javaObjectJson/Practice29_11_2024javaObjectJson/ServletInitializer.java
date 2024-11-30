package Practice29_11_2024javaObjectJson.Practice29_11_2024javaObjectJson;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Practice29112024javaObjectJsonApplication.class);
	}

}
