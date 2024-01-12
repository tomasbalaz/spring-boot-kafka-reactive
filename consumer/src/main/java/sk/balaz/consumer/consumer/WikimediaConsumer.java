package sk.balaz.consumer.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class WikimediaConsumer {

    @KafkaListener(topics = "wikimedia-stream", groupId = "consumer-group")
    public void consumeMessage(String message) {
        log.info( format("Consuming the message from wikimedia-stream topic:: %s", message));
    }
}
