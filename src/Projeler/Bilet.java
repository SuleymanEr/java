package Projeler;

import java.util.Scanner;

public class Bilet {

    public static void main(String[] args) {
        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.
        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro
İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz. İşlemlerde direkt bunları cağırabilirsiniz.
        İLK OLARAK;
        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.
    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.
       Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:
      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.
      son olarak konsolda: Frankfurt 15 Euro         yazsın.
       case: KÖLN ise
      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.
       son olarak konsolda:  Köln   20 Euro             yazsın.
       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.
       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)
        case:2 ise
        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.
          Son olarak yolculugunuzu check edin;
        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Hangi sehre gitmek istersiniz? Köln veya Frankfurt'tan birini secebilirsiniz" + "\n" + "20 KM başına 5 euro bilet parası alınmaktadir");

        String sehir = scan.next().toUpperCase();
        System.out.println("Girdiginiz rota: " + sehir);

        int kölnKmFiyat = 80 / 20 * 5;
        int frankfurtKmFiyat = 60 / 20 * 5;

        if (sehir.equals("FRANKFURT")) {
            System.out.println(sehir + ":" + " 60 km " + frankfurtKmFiyat + " Euro");

            System.out.println("Kac kisilik bilet almak istiyorsunuz? Maxsimum 2 kisilik bilet olabilir");
            int kisiSayisi = scan.nextInt();


            if (kisiSayisi == 2) {

                System.out.println("2 Kisilik bilet: " + (frankfurtKmFiyat * 2) + " Euro");
                System.out.println("Lütfen parayi yatiriniz");
                double bakiye = scan.nextDouble();


                System.out.println("Girdiginiz rota: " + sehir + "\n" + "Girdiginiz bakiye: " + bakiye + " Euro" + "\n" + "Para üstünüz: " + (bakiye - (frankfurtKmFiyat) * 2) + " Euro");


            } else {

                System.out.println(frankfurtKmFiyat + " Euro");

                System.out.println("Lütfen parayi yatiriniz");
                double bakiye = scan.nextDouble();


                System.out.println("Girdiginiz rota: " + sehir + "\n" + "Girdiginiz bakiye: " + bakiye + " Euro" + "\n" + "Para üstünüz: " + (bakiye - frankfurtKmFiyat) + " Euro");
            }


        } else {
            System.out.println(sehir + ":" + "80 km " + kölnKmFiyat + " Euro");
            System.out.println("Kac kisilik bilet almak istiyorsunuz? Maxsimum 2 kisilik bilet olabilir");
            int kisiSayisi = scan.nextInt();

            if (kisiSayisi == 2) {

                System.out.println("2 kisilik bilet: " + (kölnKmFiyat * 2) + " Euro");
                System.out.println("Lütfen parayi yatiriniz");
                double bakiye = scan.nextDouble();


                System.out.println("Girdiginiz rota: " + sehir + "\n" + "Girdiginiz bakiye: " + bakiye + " Euro" + "\n" + "Para üstünüz: " + (bakiye - (kölnKmFiyat) * 2) + " Euro");
            } else {

                System.out.println(kölnKmFiyat + " Euro");
                System.out.println("Lütfen parayi yatiriniz");
                double bakiye = scan.nextDouble();


                System.out.println("Girdiginiz rota: " + sehir + "\n" + "Girdiginiz bakiye: " + bakiye + " Euro" + "\n" + "Para üstünüz: " + (bakiye - kölnKmFiyat) + " Euro");


            }


        }

    }
}