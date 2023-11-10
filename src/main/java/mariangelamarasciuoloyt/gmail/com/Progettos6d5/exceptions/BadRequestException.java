package mariangelamarasciuoloyt.gmail.com.Progettos6d5.exceptions;

import org.springframework.validation.ObjectError;

import java.util.List;

public class BadRequestException extends RuntimeException {
    private List<ObjectError> errors;

    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(List<ObjectError> errors) {
        this.errors = errors;
    }
}
