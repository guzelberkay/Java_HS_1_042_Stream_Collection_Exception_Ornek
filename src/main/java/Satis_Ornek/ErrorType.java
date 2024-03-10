package Satis_Ornek;

public enum ErrorType {

    REPOSITORY_ERROR_UPDATE(101,"Guncellenmek istenilen kayit mevcut degil"),
    REPOSITORY_ERROR_SEARCH(102,"Aranilan id mevcut degil");

    private int code;
    private String message;
    private ErrorType(){

    }
    ErrorType(int code, String message){
        this.code=code;
        this.message= message;
    }
    public int getCode(){
        return code;
    }
    public String getMessage(){
        return message;
    }


}
