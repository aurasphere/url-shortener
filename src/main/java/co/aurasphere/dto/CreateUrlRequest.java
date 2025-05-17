package co.aurasphere.dto;

import java.net.URL;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateUrlRequest {
    @NotBlank
    private URL url;
}