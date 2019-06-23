package com.inMemoryDb.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/hello")
	public hellowordbean name() {
		return new hellowordbean("Hello shanu, how are you doing");
		
	}
	
	@GetMapping("/hello/{naam}")  //  -> /hello/anything
	public hellowordbean naam(@PathVariable String naam) {
		return new hellowordbean(naam);
		
	}
	

}
