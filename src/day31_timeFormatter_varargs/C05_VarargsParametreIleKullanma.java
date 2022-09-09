package day31_timeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {

    public static void main(String[] args) {


        enUzunKlelimeyiYazdir(5,"Ali", "Ayse", "Ismail", "Ahmet", "Babayigit");

    }

    public static void enUzunKlelimeyiYazdir(int kelimeSayisi,String... kelime) {
        String enUzunKelime = kelime[0];

        for (String each : kelime
        ) {
            if (each.length() > enUzunKelime.length()) {

                enUzunKelime = each;
            }

        }
        System.out.println("Girilen kelimelrin en uzunu: " + enUzunKelime);
    }
}
