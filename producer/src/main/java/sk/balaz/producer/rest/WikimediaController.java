package sk.balaz.producer.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.balaz.producer.stream.WikimediaStreamConsumer;

@RestController
@RequestMapping("/api/v1/wikimedia")
@RequiredArgsConstructor
public class WikimediaController {

    private final WikimediaStreamConsumer streamConsumer;

    @GetMapping
    public void startPublishing() {
        streamConsumer.consumeStreamAndPublish();
    }
}
