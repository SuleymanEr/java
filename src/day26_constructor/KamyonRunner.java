package day26_constructor;

public class KamyonRunner {

    public static void main(String[] args) {
        Kamyon kamyon1 = new Kamyon();
        System.out.println("kamyon1 ozelikleri "+"\n"+ kamyon1);
        System.out.println();
        Kamyon kamyon2 = new Kamyon("Mercedes", "4140", 2005, 500000);
        System.out.println("Kamyon2 bilgileri "+"\n" + kamyon2.toString());
        System.out.println();
        Kamyon kamyon3 = new Kamyon("MAN", "as900", 2007, 400000);
        System.out.println("Kamyon3 bilgileri "+"\n" + kamyon3);
        System.out.println();
        Kamyon kamyon4 = new Kamyon("Scania", "s540");
        System.out.println("Kamyon4 bilgileri "+"\n" + kamyon4);


    }
}