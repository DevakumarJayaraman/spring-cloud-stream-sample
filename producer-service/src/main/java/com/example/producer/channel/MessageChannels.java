package com.example.producer.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * Defining all the required channels
 * 
 * @author Devakumar Jayaraman
 */
public interface MessageChannels {

	String OUTBOUND_CHANNEL1 = "outboundChannel1";

	@Output(OUTBOUND_CHANNEL1)
	MessageChannel getOutboundChannel1();
}
