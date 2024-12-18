package HospitalProject.HospitalProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.cico.*")
@EntityScan("com.cico.entity")
@EnableJpaRepositories("com.cico.repo")
public class HospitalProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalProjectApplication.class, args);
	}

}
