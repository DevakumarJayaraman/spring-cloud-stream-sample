package com.example.producer.channel;

import java.util.Date;

import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.MimeTypeUtils;

@Component
public class ScheduledProducer {

	private OutboundChannels messagingChannels;

	public ScheduledProducer(OutboundChannels messagingChannels) {
		this.messagingChannels = messagingChannels;
	}

	@Scheduled(fixedDelay = 10000)
	public void execute() {
		messagingChannels.channel1().send(MessageBuilder.withPayload(new Date())
				.setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON).build());
	}
}
