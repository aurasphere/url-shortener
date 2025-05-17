package co.aurasphere;

import java.net.URI;
import java.net.URL;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.aurasphere.dto.CreateUrlRequest;
import co.aurasphere.dto.CreateUrlResponse;

@RestController
@RequestMapping("/api/urls")
public class UrlShortenerController {

    @Autowired
    private UrlShortenerService urlShortenerService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateUrlResponse createUrl(@RequestBody CreateUrlRequest request) {
        UUID id = urlShortenerService.createUrl(request.getUrl());
        return new CreateUrlResponse(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Void> getUrl(@PathVariable UUID id) {
        URL url = urlShortenerService.getUrl(id);
        return ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create(url.toString()))
                .build();
    }
}