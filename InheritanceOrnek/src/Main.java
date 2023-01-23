public class Main {
/*  uml-calisanlar-akademisyen  -ogretimgorevlisi,asistan(-labasistani)
                  -memur        -bilgiislem,guvenlikgorevlisi

  */
    public static void main(String[] args) {

	//Calisan isci1 = new Calisan("ibrahim hekim","05075777744","ibrahim@email");


    //Akademisyen hoca1 = new Akademisyen(isci1.getAdSoyad(), isci1.getTelefon(), isci1.getEposta(), "yapay zeka", "profesor");

    OgretimGorevlisi ogretimGorevlisi1 = new OgretimGorevlisi("bekir hekim","05316282569", "bekir@email",
            "siber guvenlik","ogretim gorevlisi","28");

    Asistan asistan1 = new Asistan("Mustafa Hekim", "05055055555","mustafa@email","embedded system", "doktor","10:00");

    /*Calisan[] loginUser = {isci1,hoca1,ogretimGorevlisi1,asistan1};
        //polymorphism
    Calisan.loginUsers(loginUser);*/

        ogretimGorevlisi1.derseGir("10:00");
        asistan1.derseGir("11:00");

    }
}
