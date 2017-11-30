package org.andrey.spring.section_1_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.reactor.core.ReactorCoreAutoConfiguration;

@SpringBootApplication(exclude = {ReactorCoreAutoConfiguration.class})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
