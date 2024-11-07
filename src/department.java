import java.util.ArrayList;
import java.util.List;

public class department {
    private personel takimLideri;
    private List<personel> personelListesi = new ArrayList<>();
    private List<String> gorevListesi = new ArrayList<>();

    public department(personel takimLideri) {
        this.takimLideri = takimLideri;
    }

    public void takimLideriDegistir(personel yeniLider) {
        this.takimLideri = yeniLider;
        System.out.println("Yeni takım lideri: " + yeniLider.getAd() + " " + yeniLider.getSoyad());
    }

    public void personelEkle(personel personel) {
        personelListesi.add(personel);
        System.out.println(personel.getAd() + " " + personel.getSoyad() + " personel listesine eklendi.");
    }

    public void personelCikar(personel personel) {
        personelListesi.remove(personel);
        System.out.println(personel.getAd() + " " + personel.getSoyad() + " personel listesinden çıkarıldı.");
    }

    public void gorevEkle(String gorev) {
        gorevListesi.add(gorev);
        System.out.println("Görev eklendi: " + gorev);
    }

    public void gorevTamamla(int gorevIndex) {
        if (gorevIndex >= 0 && gorevIndex < gorevListesi.size()) {
            System.out.println("Görev tamamlandı: " + gorevListesi.get(gorevIndex));
            gorevListesi.remove(gorevIndex);
        } else {
            System.out.println("Geçersiz görev!!!");
        }
    }
}
