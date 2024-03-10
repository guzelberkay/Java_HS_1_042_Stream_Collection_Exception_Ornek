package logging;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Optional;

public class DosyaIslemi {
    public void saveLog(Log log) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/log.txy");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(log);
            objectOutputStream.close();
        } catch (Exception exception) {
            System.out.println("Log kayit edilemiyor. "+exception);
        }

    }
    public Optional<Log> getLogFile(){
        try {
            FileInputStream fileInputStream = new FileInputStream("src/main/resources/log.txy");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Log log =(Log) objectInputStream.readObject();
            return Optional.of(log);
        }catch (Exception exception){
            System.out.println("Beklenmeyen hata...: " +exception);
            return Optional.empty();
        }
    }
}
