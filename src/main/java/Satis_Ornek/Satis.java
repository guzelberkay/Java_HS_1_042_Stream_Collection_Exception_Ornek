package Satis_Ornek;

import java.util.Date;
import java.util.Random;
import java.util.logging.LoggingPermission;

public class Satis {
    Long id;
    String urunAdi;
    double fiyat;
    int adet;
    double toplamFiyat;
    String tarih;

    public Satis( String urunAdi, double fiyat, int adet) {

        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.adet = adet;
        this.toplamFiyat = toplamFiyat;
        this.id=new Random().nextLong(0,9000);
        this.tarih=new Date().toString();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Satis{");
        sb.append("id=").append(id);
        sb.append(", urunAdi='").append(urunAdi).append('\'');
        sb.append(", fiyat=").append(fiyat);
        sb.append(", adet=").append(adet);
        sb.append(", tplamFiyat=").append(toplamFiyat);
        sb.append(", tarih='").append(tarih).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long is) {
        this.id = id;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public double getTplamFiyat() {
        return toplamFiyat;
    }

    public void setTplamFiyat(double tplamFiyat) {
        this.toplamFiyat = tplamFiyat;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }
}