package Projeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String deger1;

        do {
            System.out.println("lutfen yapmak istediginiz islemi secin : ");
            System.out.println("1 - kayit olmak");
            System.out.println("2 - giris yapmak");
            System.out.println("3 - QR islemler");
            System.out.println("4 - cikis");
            deger1 = input.next();

            if (deger1.equals("1")) {
                System.out.println("yeni kullanici adi gir : ");
                String name = input.next();
                System.out.println("yeni sifre gir : ");
                String password = input.next();

                customers.add(new Customer(name, password));
                System.out.println("kayit isleminiz basariyla gerceklestirilmistir...");

            } else if (deger1.equals("2")) {
                int sayac1 =0; //3 defa giris deneme hakki tanimlandi
                do {
                    System.out.println("isim gir : ");
                    String name = input.next();
                    System.out.println("sifre gir : ");
                    String password = input.next();
                    int sayac2 =0; //kayit bulununca 1 olur. Bulunamazsa 0 kalir.

                    for (int i=0;i<customers.size();i++) {
                        if (name.equals(customers.get(i).getUserName()) && password.equals(customers.get(i).getUserPassword())) {
                            sayac1 = 4;
                            sayac2 = 1;
                            String sayac3; //tamam mi devam mi kontrolu icin
                            do {
                                System.out.println("giris talebiniz basariyla gerçeklesti.");
                                System.out.println("lutfen yapmak istediginiz islemi seciniz : ");
                                System.out.println("1 - para cekme");
                                System.out.println("2 - para yatirma");
                                System.out.println("3 - bakiye sorgula");
                                System.out.println("4 - hesabi sil");
                                System.out.println("5 - cıkıs");
                                System.out.println("6 - uygulamadan cikis");
                                int a = input.nextInt();

                                switch (a) {
                                    case 1: {
                                        customers.get(i).withdraw();
                                        sayac3 = "devam";
                                        break;
                                    }
                                    case 2: {
                                        customers.get(i).investment();
                                        sayac3 = "devam";
                                        break;
                                    }
                                    case 3: {
                                        customers.get(i).showBalance();
                                        sayac3 = "devam";
                                        break;
                                    }
                                    case 4: {

                                        System.out.println("sifrenizi giriniz : ");
                                        String sifre = input.next();

                                        if (sifre.equals(customers.get(i).getUserPassword())){
                                            customers.remove(i);
                                            System.out.println("hesabiniz basariyla silinmistir..");
                                            System.out.println("ana menuye yonlendiriliyosunuz..");
                                            sayac3 = "bitir";
                                        }else {
                                            System.out.println("yanlis giris yaptiniz..");
                                            sayac3 = "devam";
                                        }
                                        break;
                                    }
                                    case 5: {
                                        deger1 = "1";
                                        sayac3 = "bitir";
                                        break;
                                    }
                                    case 6: {
                                        System.out.println("hoscakalın!!");
                                        deger1 = "4";
                                        sayac3 = "bitir";
                                        break;
                                    }
                                    default: {
                                        System.out.println("yanlis islem!!");
                                        sayac3 = "devam";
                                    }
                                }
                            } while (sayac3.equals("devam"));

                        }
                    }
                    if (sayac2 == 0){
                        System.out.println("boyle bir kayit bulunamadi..");
                        sayac1++;
                    }
                    if (sayac1 == 3){
                        System.out.println("3 kere yanlis giris yaptiniz. kartiniz bloke olmustur.");
                        deger1 = "4";
                    }
                }while (sayac1 <3);

            } else if (deger1.equals("3")) {

                System.out.println("suanda bu hizmet calismamaktadir");

            } else if (deger1.equals("4")) {

                System.out.println("hoscakalin");
            } else {

                System.out.println("yanlis giris yaptiniz : ");
            }
        } while (!deger1.equals("4"));
    }

    public static String devam(){       //kullanilmadi ama hazir da bulunsun diye yazildi.
        Scanner input = new Scanner(System.in);
        System.out.println("baska bir islem yapmak ister misiniz?(e/h)");
        String devam = input.next();
        if (devam.equals("e") || devam.equals("E")) {
            devam = "devam";
        } else {
            System.out.println("hoscakalın!!");
            devam = "bitir";
        }
        return devam;
    }
}
