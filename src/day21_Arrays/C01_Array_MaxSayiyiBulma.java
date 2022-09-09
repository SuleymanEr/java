package day21_Arrays;

import java.util.Arrays;

public class C01_Array_MaxSayiyiBulma {

    public static void main(String[] args) {
        // Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
        int[] sayilar = {3, 5, 7, 1, 4, 9, 5, 2};
        maxSayiyiYazdir(sayilar);
    }

    public static void maxSayiyiYazdir(int[] sayilar) {
        // Arrays.sort(sayilar);
       // System.out.println(sayilar[sayilar.length-1]);

        int maxSayi = sayilar[0];
        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i] > maxSayi) {
                maxSayi = sayilar[i];
            }
        }
        System.out.println("Arraydeki en buyuk sayi : " + maxSayi);
    }

}
