package com.example.consumer.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.MessageChannel;

/**
 * Defining all the required channels
 * 
 * @author Devakumar Jayaraman
 */
public interface MessageChannels {

	String INBOUND_CHANNEL1 = "inboundChannel1";

	@Input(INBOUND_CHANNEL1)
	MessageChannel getInboundChannel1();

}
