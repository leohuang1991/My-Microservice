package productservice.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Con1 {

	@Autowired
	KafkaTemplate<String, String> kt;
	
	
	@GetMapping(path="/bb1")
	public String aab() {
		return "Hello Product";
	}
	
	
	@GetMapping(path="/bb2")
	public String aab2() {
		
	kt.send("my-topic","Max");
		return "Hello Product";
	}
}
