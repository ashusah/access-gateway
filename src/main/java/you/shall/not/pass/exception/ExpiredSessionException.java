package you.shall.not.pass.exception;

import lombok.Getter;

@Getter
public class ExpiredSessionException extends RuntimeException {
    public ExpiredSessionException(String message) {
        super(message);
    }
}
