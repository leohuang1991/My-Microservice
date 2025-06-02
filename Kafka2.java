package notification;

import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Kafka2 {

	@KafkaListener(topics = "my-topic",groupId = "my-consumer-group-id")
	public void recon2(String a) {
		System.out.println(a);
	}
}
