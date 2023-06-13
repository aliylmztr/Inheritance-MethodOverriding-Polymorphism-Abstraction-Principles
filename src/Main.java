public class Main {
    public static void main(String[] args) {
        Calisan c1 = new Calisan("Mustafa Çetindağ", "05001234567", "info@patika.dev");

        Akademisyen a1 = new Akademisyen("Patika Dev", "05009876543", "bilgi@patika.dev", "CENG", "Doçent");
        
        Memur m1 = new Memur("Ali Veli", "05001112233", "a@patika.dev", "Bilgi İşlem", "09:00-18:00");

        OgretimGorevlisi o1 = new OgretimGorevlisi("Mehmet Çetin", "05005553322", "mehmet@patika.dev", "CENG", "Doçent", "110");

        System.out.println(c1.getAdSoyad());
        c1.giris();
        a1.cikis();
        a1.derseGir();
        m1.calis();
        o1.giris();
        System.out.println(o1.getKapiNo());

        o1.giris("10:00", "18:00");
        a1.giris();
        o1.giris();
        m1.giris();

        Calisan a2 = new Akademisyen("Kodluyoruz Com", "05001231212", "kodluyoruz@patika.dev", "CENG", "Profesör");
        
        a2.giris();

        // int[] loginUser = new int [4];
        Calisan[] loginUser = {c1, a1, m1, o1};
        Calisan.girisYapanlar(loginUser);

        o1.derseGir("10:00");

    }
}
