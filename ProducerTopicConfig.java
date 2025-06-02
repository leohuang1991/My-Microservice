package productservice.demo;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.support.serializer.JsonSerializer;

@Configuration
public class ProducerTopicConfig {

	@Bean
	public NewTopic config1() {
		return TopicBuilder.name("my-topic").build();
		
		
	}
}
