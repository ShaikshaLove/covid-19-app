package io.app;

import io.app.client.DistrictWiseData;
import io.app.dto.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;
import java.util.Locale;
import java.util.Map;

@SpringBootApplication
@RestController
@EnableFeignClients
@EnableSwagger2
public class Covid19Application implements WebMvcConfigurer {

	@Autowired
	private DistrictWiseData districtWiseData;

	public static void main(String[] args) {
		SpringApplication.run(Covid19Application.class, args);
	}
	
	@GetMapping("/hi")
	public List<State> getMsg() {
		return districtWiseData.getDestrictData();
	}



	@Bean
	public LocaleChangeInterceptor localeChangeInterceptor() {
		LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
		lci.setParamName("lang");
		return lci;
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(localeChangeInterceptor());
	}
}
