package com.inMemoryDb.restfulwebservice;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class RestfulWebServiceApplication {

			public static void main(String[] args) {
				SpringApplication.run(RestfulWebServiceApplication.class, args);
			}

			@Bean
			public LocaleResolver localeResolver() {
				SessionLocaleResolver localeResolver = new SessionLocaleResolver();
				localeResolver.setDefaultLocale(Locale.US);
				return localeResolver;
				
			}
			
			
			//@Bean({"b1", "b2"}) 
			@Bean
			public ResourceBundleMessageSource messageSource()
			{
				ResourceBundleMessageSource messageSource_samename = new ResourceBundleMessageSource();
				messageSource_samename.setBasename("TranslationFile");
				return messageSource_samename;
				
			}

}
