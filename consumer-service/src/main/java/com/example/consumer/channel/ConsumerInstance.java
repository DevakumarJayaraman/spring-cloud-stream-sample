package com.example.consumer.channel;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class ConsumerInstance {
	
	@StreamListener(Sink.INPUT)
	public void consumerMessage(String message) {
		System.out.println("Consuming :" + message);
	}
}