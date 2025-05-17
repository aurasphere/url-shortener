package co.aurasphere;

import java.net.URL;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShortenedUrl {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private URL url;

    public ShortenedUrl(URL url) {
        this.url = url;
    }
}