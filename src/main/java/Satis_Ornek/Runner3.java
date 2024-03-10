package Satis_Ornek;

import logging.DosyaIslemi;
import logging.Log;

public class Runner3 {
    public static void main(String[] args) {
        DosyaIslemi dosyaIslemi = new DosyaIslemi();
        try {
            SatisRepository repository = new SatisRepository();
            Satis satis = repository.findById(5L);
            System.out.println(satis);
        }catch (SatisException exception){
            Log log = new Log(exception.getErrorType().getCode(), exception.getMessage(), exception);
            dosyaIslemi.saveLog(log);

        }
        System.out.println(dosyaIslemi.getLogFile().get());

    }
}
