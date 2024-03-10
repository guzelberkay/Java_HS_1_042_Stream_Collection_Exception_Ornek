import java.util.*;
import java.util.stream.Collectors;

public class Runner2 {
    public static void main(String[] args) {
        /**
         * Soru-2 Zorlayıcı soru
         ** - İçerisinde 10 metin olan bir liste oluşturunuz.(Yazılım dillerinin isimleri olsun. Java, C#, Pyhton, C++ gibi)
         * * - StreamAPI kullanarak bu liste içinde uzunluğu 3 ten fazla olan mettinleri uppercase olarak consola yazdırınız.
         * * - Bu liste içinde aynı harf ile başlayan metinleri Bir map şeklinde dönüştüren StreamAPI kodunu yazınız.
         * * - Kullanıcının girdiği belli bir index numarasındaki metni döndüren bir method yazınız. Eğer girilen index
         * * numarası listenin sınırları dışında ise, IndexOutOfBoundException fırlatsın. girilen index mevcut ise
         * * ilgili kayıt geri döndürülsün.
         * * - Yukarıda tanımlanan method u kullanan bir kod bloğu yazınız ve bu kod bloğunu try..catch bloğunda kontrol
         * * ederek çalıştırınız.
         * )
         */
        List<String> metinList = new ArrayList<>(List.of("Java","C#","Pyhton","C++","Pascal","Basic","Ada","Fortran","Swift","Delphi"));
        try {
            System.out.println(metinGetir(2, metinList));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("***********************************************************");
//içinde uzunluğu 3 ten fazla olan metinleri uppercase olarak consola yazdırınız.
        metinList.stream()
                .filter(s -> s.length() > 3)
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("***********************************************************");
//Bu liste içinde aynı harf ile başlayan metinleri Bir map şeklinde dönüştüren StreamAPI kodunu yazınız.
        Map<Character, List<String>> map = metinList.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(map);
        System.out.println("***********************************************************");
       TreeMap <String, List<String>> map2 = metinList.stream()
                .collect(Collectors.groupingBy(s -> s.substring(0,1),TreeMap::new,Collectors.toList()));
        System.out.println(map2);
        }



    public static String metinGetir(int index, List<String> metinListesi) throws IndexOutOfBoundsException {
        if (index < 0 || index >= metinListesi.size()) {
            throw new IndexOutOfBoundsException("Index numarası listenin sınırları dışında");
        }
        return metinListesi.get(index);

    }
}
