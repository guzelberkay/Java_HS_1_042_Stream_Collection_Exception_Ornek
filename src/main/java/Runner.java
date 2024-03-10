import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        /**
         * Soru-1 Orta Seviye
         * - İçinde 10 adet sayı olan bir liste oluşturunuz
         * - StreamAPI Kullanarak bu sayıların , AVG, SUM, bilgileri kontrole yazdırınız.
         * - Bir method yazarak bu methodun bir List ve bir int değer olarak parametre almasını
         * ve bu methodun verilen bilgilerini isleyerek, liste içinden int sayı değerini simesini
         * sağlayınız
         * Ayrıca eğer girilen sayi listenin içersinde yok ise IllegalArgumentException("bulunamadi")
         * şeklinde hata fırlatsın.
         * ------------------------------------------------
         */
        List<Integer> sayiList = new ArrayList<>(List.of(5,15,25,35,45,55,65,75,95,85));
        double average = sayiList.stream().mapToInt(Integer::intValue).average().orElse(0);
        long sum = sayiList.stream().mapToInt(x->x).sum();

        System.out.println("Average: " + average);
        System.out.println("Sum: " + sum);
    }

    public static void degerSil(List<Integer> list, int deger) throws IllegalAccessException {
        if (list.stream().anyMatch(x->x.equals(deger))){
            list.remove(Integer.valueOf(deger));
        }else {
            throw new IllegalAccessException("Bulunamadi");
        }
    }
}
