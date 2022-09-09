package replit;

import java.util.Scanner;

public class ENG_If_Switch_Ternary_StringMeth_2 {

    public static void main(String[] args) {
      /*  Ask user Name, Surname and credit card numbers than convert it to special form. (Initials for name and surname should be uppercase)
        (Check credit card number, if there aren’t 16 digit print “Invalid credit card number”

        Input :

        John White 1234234534561478

        Output :

        Name : J*** W****

        CCN : **** **** **** 1478
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isimizi giriniz");
        String isim = scan.nextLine();
        System.out.println("LÜtfen soyisminizi giriniz");
        String soyisim = scan.nextLine();
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");

        System.out.println("Lütfen kredi karti numaranizi giriniz");

        String kartNo = scan.next();
        if (kartNo.length() != 16) {
            System.out.println("Lütfen 16 haneli kart numaranizi giriniz");

        }

        String kartIlk12 = kartNo.substring(0, 12).replaceAll("\\d", "*");
        String kartSon4 = kartNo.substring(12, 16);
        String yeniKartNo = kartIlk12 + kartSon4;


        System.out.println("adiniz soyadiniz: " + isim + " " + soyisim + "\n" + "kredi kart numaraniz: " +"**** **** ****"+" "+kartSon4);


    }
}
