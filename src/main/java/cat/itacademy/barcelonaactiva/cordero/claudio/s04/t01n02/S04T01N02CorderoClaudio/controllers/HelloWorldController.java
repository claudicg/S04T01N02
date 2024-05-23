package cat.itacademy.barcelonaactiva.cordero.claudio.s04.t01n02.S04T01N02CorderoClaudio.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

	private Logger logger = LoggerFactory.getLogger(HelloWorldController.class);
	
	@GetMapping("/HelloWorld")
	public String greet(@RequestParam("name") @DefaultValue("UNKNOWN") String name) {
		
		logger.info("HelloWorldControler :: greet :: Return a greeting @RequestParam.");
		
		return "Hello " + name + ". You are running a Gradle project.";
	}
	
	@GetMapping("/HelloWorld/{name}")
	public String greet2(@PathVariable("name") String name) {
		
		logger.info("HelloWorldControler :: greet2 :: Return a greeting @PathVariable.");
		
		return "Hello " + name + ". You are running a Gradle project.";
	}
}
