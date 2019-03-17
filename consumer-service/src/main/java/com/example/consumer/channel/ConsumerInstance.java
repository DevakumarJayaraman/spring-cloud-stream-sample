package com.example.consumer.channel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;

@EnableBinding(MessageChannels.class)
public class ConsumerInstance {

	private static final Logger LOG = LoggerFactory.getLogger(ConsumerInstance.class);

	@StreamListener(MessageChannels.INBOUND_CHANNEL1)
	public void processChannel1(String message, @Header(KafkaHeaders.RECEIVED_PARTITION_ID) int partition) {
		LOG.info("partition ID :" + partition + ",Message :" + message);
	}
}