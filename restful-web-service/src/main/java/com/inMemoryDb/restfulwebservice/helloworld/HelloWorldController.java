package com.inMemoryDb.restfulwebservice.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource9 ;
	
	
	@GetMapping("/hello")
	public hellowordbean name() {
		return new hellowordbean("Hello shanu, how are you doing");
		
	}
	
	@GetMapping("/hello/{naam}")  //  -> /hello/anything
	public hellowordbean naam(@PathVariable String naam) {
		return new hellowordbean(naam);
		
	}
	
	@GetMapping("/hello-translation")
	public String name(@RequestHeader(name = "Accept-Language", required = false) Locale local) {
		return messageSource9.getMessage("HELLO_LABEL", null, local); //can use LocaleContextHolder.getLocale() here and skip @requestHeader 
		
	}
	

}
