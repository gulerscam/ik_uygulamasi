import java.time.LocalDate;
import java.time.Period;

public abstract class personel {
    private String ad;
    private String soyad;
    private LocalDate dogumTarihi;

    public personel(String ad, String soyad, LocalDate dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }
    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public LocalDate getDogumTarihi() {
        return dogumTarihi;
    }

    // Emeklilik hesaplama metodu, her alt sınıfta farklı olacak
    public abstract void emeklilikHesapla();
}


