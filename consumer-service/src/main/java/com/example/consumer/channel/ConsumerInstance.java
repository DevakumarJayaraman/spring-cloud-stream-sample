package com.example.consumer.channel;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(InboundChannels.class)
public class ConsumerInstance {
	
	@StreamListener(InboundChannels.CHANNEL1)
	public void consumerMessage(String message) {
		System.out.println("Consuming :" + message);
	}
}