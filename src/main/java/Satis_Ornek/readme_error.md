# HATA-ISTISNA LISTELERI

## HATA KODLARI

    0000-HATA
    0101-KULLANICI GENEL HATA
    0102-KULLANICI BULUNAMADI
         İlk kayit sirasinda alinan hatalar, genellikle verilerin cekilmesi nedeniyle 
         olur. Tekrar deneyin eger id var ama kayıt bulunamıyor ise redis cache sorunu
         olabilir. Ön belleği resetlemek sorunu çözer.
    0103-GUNCELLEME HATASI
        0103.1-GUNCELLENECEK KULLANICI BULUNAMADI
    0104-KAYIT EKLEME HATASI
        0104.1-KAYIT EKLEME HATASI