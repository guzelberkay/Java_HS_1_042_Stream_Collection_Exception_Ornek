package logging;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Log implements Serializable {
    int code;
    String message;
    Exception exception;

    public Log(int code, String message, Exception exception) {
        this.code = code;
        this.message = message;
        this.exception = exception;
    }

    public String toString(){
        return "ERROR- "+ LocalDateTime.now() + " -Ex: "+exception.getClass()+ "Code: "+ this.code + " Message: "+message;
    }
}
