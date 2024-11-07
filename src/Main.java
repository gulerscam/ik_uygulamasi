import java.time.LocalDate;

public class Main {
    public void main(String[] args) {

        personel lider = new erkek("Ahmet", "Yılmaz", LocalDate.of(1980, 5, 20));
        department departman = new department(lider);

        // Takım liderini değiştirme
        personel yeniLider = new kadin("Ayşe", "Demir", LocalDate.of(1985, 8, 15));
        departman.takimLideriDegistir(yeniLider);

        // Personel ekleme
        personel personel1 = new erkek("Ali", "Kaya", LocalDate.of(1990, 3, 10));
        personel personel2 = new kadin("Fatma", "Çelik", LocalDate.of(1995, 11, 5));
        personel personel3 = new kadin("Guler", "Cam", LocalDate.of(1994,6,1));
        departman.personelEkle(personel1);
        departman.personelEkle(personel2);
        departman.personelEkle(personel3);
        departman.personelCikar(personel3);

        // Görev ekleme ve tamamlama
        departman.gorevEkle("Proje Planlama");
        departman.gorevEkle("Raporlama");
        departman.gorevTamamla(0);

        // Emeklilik hesaplama
        lider.emeklilikHesapla();
        yeniLider.emeklilikHesapla();
        personel1.emeklilikHesapla();
        personel2.emeklilikHesapla();
        personel3.emeklilikHesapla();
    }
}
