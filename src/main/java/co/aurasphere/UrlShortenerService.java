package co.aurasphere;

import java.net.URL;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UrlShortenerService {

    @Autowired
    private UrlShortenerRepository urlShortenerRepository;

    public UUID createUrl(URL url) {
        ShortenedUrl urlEntity = new ShortenedUrl(url);
        return urlShortenerRepository.save(urlEntity).getId();
    }

    public URL getUrl(UUID id) {
        ShortenedUrl url = urlShortenerRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "URL not found with id: " + id));
        return url.getUrl();
    }
}