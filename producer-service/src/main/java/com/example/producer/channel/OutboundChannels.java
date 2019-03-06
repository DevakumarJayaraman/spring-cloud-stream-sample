package com.example.producer.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface OutboundChannels {
	
	String CHANNEL1 = "channel1";
	
	@Output(CHANNEL1)
    MessageChannel channel1();
}
