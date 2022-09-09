package question;

public class varargs3 {




    public static void main(String[] argv)
    {
        int sonuc1 = topla(1, 2);
        int sonuc2 = topla(1, 2, 3);
        int sonuc3 = topla(1, 2, 4, 5, 6, 1000);
        int sonuc4= topla(6,9,36,15,36,999,47855);

        System.out.println(sonuc1 + "\n" + sonuc2 + "\n" + sonuc3+"\n" + sonuc4);
    }

    private static int topla(int... sayi)
    {
        int toplam = 0;

        for (int each : sayi)
            {
                toplam += each;
            }

        return toplam;
    }
}

