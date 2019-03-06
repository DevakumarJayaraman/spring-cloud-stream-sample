package com.example.consumer.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

public interface InboundChannels {
	
	String CHANNEL1 = "channel1";
	
	@Input(CHANNEL1)
    MessageChannel channel1();
}
