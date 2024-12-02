package RequestBodyByOneToMany2_12_2024Class_3.RequestBodyByOneToMany2_12_2024Class_3;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RequestBodyByOneToMany2122024Class3Application.class);
	}

}
