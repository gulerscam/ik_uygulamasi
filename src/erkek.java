import java.time.LocalDate;
import java.time.Period;

public class erkek extends personel {

    public erkek(String ad, String soyad, LocalDate dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public void emeklilikHesapla() {
        int yas = Period.between(getDogumTarihi(), LocalDate.now()).getYears();
        int kalanYil = 65 - yas;
        System.out.println(getAd() + " " + getSoyad() + " için emekliliğe kalan yıl: " + (kalanYil > 0 ? kalanYil : 0));
    }
}