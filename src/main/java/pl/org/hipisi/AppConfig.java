package pl.org.hipisi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "pl.org.hipisi")
public class AppConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	Cart cart() {
		return new Cart();
	}

}
