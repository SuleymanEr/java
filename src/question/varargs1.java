package question;

public class varargs1 {


    static void stringVeInteger(String str, int... sayi) {
        System.out.println("String: " + str);
        System.out.println("Argument sayisi: "
                + sayi.length);


        for (int each : sayi)
            System.out.print(each + " ");

        System.out.println();
    }

    public static void main(String args[]) {

        stringVeInteger("Deutschland", 100, 200);
        stringVeInteger("Mönchengladbach", 1, 2, 3, 4, 5);
        stringVeInteger("Bayern München");
    }
}


