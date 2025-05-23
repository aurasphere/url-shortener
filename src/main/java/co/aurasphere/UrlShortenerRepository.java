package co.aurasphere;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlShortenerRepository extends JpaRepository<ShortenedUrl, UUID> {
}