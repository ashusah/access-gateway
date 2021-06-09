package you.shall.not.pass.exception;

import lombok.Getter;
import you.shall.not.pass.domain.Access;

@Getter
public class MongoException extends RuntimeException {
    public MongoException(String message) {
        super(message);
    }
}
