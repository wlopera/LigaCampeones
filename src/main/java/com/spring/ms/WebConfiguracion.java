package com.spring.ms;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.ms.service.LigaServiceApi;
import com.spring.ms.service.LigaServiceApiImpl;

@Configuration
public class WebConfiguracion {

	@Bean
	ServletRegistrationBean h2ServletRegistration(){
		ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
	    registration.addUrlMappings("/console/*");
	    return registration;
	}
	
}
