package com.example.producer.channel;

import org.springframework.cloud.stream.binder.PartitionKeyExtractorStrategy;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component("partitionKeyExtractor")
public class PartitionKeyExtractorImpl implements PartitionKeyExtractorStrategy {
	int MAX_PARTITION = 10;
	int partitionCounter = 0;

	@Override
	public Object extractKey(Message<?> message) {
		synchronized (this) {
			partitionCounter++;
			if (partitionCounter >= MAX_PARTITION) {
				partitionCounter = 0;
			}
		}
		System.out.println("partition id - " + partitionCounter);
		return partitionCounter;
	}
}