package Satis_Ornek;

public class SatisException extends RuntimeException {
private final ErrorType errorType;
    public SatisException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }
    public ErrorType getErrorType(){
        return errorType;
    }


}
