package Projeler;

import java.util.Scanner;

public class Manav_skizz {
    /* Basarili Market-manav alış-veriş programı.
    *
    * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
    *         No        Ürün         Fiyat
            ====     =======      =========
            00  Domates           20.10 TL
            01  Patates           30.20 TL
            02  Biber             30.50 TL
            03  Soğan             20.30 TL
            04  Havuç             30.10 TL
            05  Elma               50.20 TL
            06  Muz                 100.90 TL
            07  Çilek              60.10 TL
            08  Kavun              40.30 TL
            09  Üzüm              20.70 TL
            10  Limon             10.50 TL
    * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini
    * isteyiniz.
    * 3. Adım: Kaç kg satın almak istediğini ve urun kodunu  aliniz.
    * 4. Adım: Alınacak bu ürünü sepete ekleyiniz
    * 5. Sepeti yazdırınız.
    * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına
    * yönlendiriniz.
    * 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
    * ödeme sonrasında programı bitirinzi.
    */




    public static void main(String[] args) throws InterruptedException {


   //     int [] ürünNo={0,1,2,3,4,5,6,7,8,9,10};

        System.out.println("--Marketimize Hosgeldiniz--");
        Thread.sleep(2000);

        System.out.println(
                "No    Ürün      Fiyat\n" +
                "==== ====       =====\n" +
                "0  Domates     20.10 TL\n" +
                "1  Patates     30.20 TL\n" +
                "2  Biber       30.50 TL\n" +
                "3  Soğan       20.30 TL\n" +
                "4  Havuç        0.10 TL\n" +
                "5  Elma        50.20 TL\n" +
                "6  Muz         100.90 TL\n" +
                "7  Çilek       60.10 TL\n" +
                "8  Kavun        0.30 TL\n" +
                "9  Üzüm        20.70 TL\n" +
                "10  Limon       10.50 TL");

        Thread.sleep(2000);
        System.out.println("Lütfen istedginiz ürünün önce kodunu sonra kac kilo almak istediginizi   giriniz");
        Scanner scan=new Scanner(System.in);
        int ürünNo=scan.nextInt();

        int kilo=scan.nextInt();



        switch (ürünNo){

            case 0:
                double fiyat=kilo*20.10;
                break;
            case 1:
                double fiyat1=kilo*30.20;
                break;
            case 2:
                double fiyat2=kilo*30.50;
                break;
            case 3:
                double fiyat3=kilo*20.30;
                break;
            case 4:
                double fiyat4=kilo*30.10;
                break;
            case 5:
                double fiyat5=kilo*50.20;
                break;
            case 6:
                double fiyat6=kilo*100.90;
                break;
            case 7:
                double fiyat7=kilo*60.10;
                break;
            case 8:
                double fiyat8=kilo*40.30;
                break;
            case 9:
                double fiyat9=kilo*20.70;
                break;
            case 10:
                double fiyat10=kilo*10.50;
                break;
            default:
                System.out.println("Lütfen gecerli bir ürün kodu giriniz");



        }
        System.out.println();
    }
}
