package com.example.producer.channel;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeTypeUtils;

@Component
@EnableBinding(MessageChannels.class)
public class ScheduledProducer {

	@Autowired
	private MessageChannels messageChannels;
	
	@Scheduled(fixedDelay = 1000)
	public void execute() {
		String message = new Date().getTime() + "";
		System.out.println("publishing message :" + message);
		messageChannels.getOutboundChannel1().send(MessageBuilder.withPayload(message)
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());
	}
}
