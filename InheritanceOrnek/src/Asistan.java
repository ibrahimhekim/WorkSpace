public class Asistan extends Akademisyen {
    private String ofisSaati;

    public Asistan(String adSoyad, String telefon, String eposta, String bolum, String unvan, String ofisSaati) {
        super(adSoyad, telefon, eposta, bolum, unvan);
        this.ofisSaati = ofisSaati;
    }

    public String getOfisSaati() {
        return ofisSaati;
    }

    public void setOfisSaati(String ofisSaati) {
        this.ofisSaati = ofisSaati;
    }

    public void quizYap(){
        System.out.println(this.getAdSoyad() + " hoca quiz yapti");
    }

    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() + " asistan saat " + ofisSaati +" itibari ile giris yapti");
    }

    @Override
    public void derseGir(String saat){
        System.out.println(this.getAdSoyad() + " asistani " + saat + " itibariyle derse girdi");
    }
}
