package question;

public class varargs {


        // sayi degiskenleri alan bir Vararg methodu olusturun
        //  3 farkli const. call olusturup, icerisindeki argumentlari for each ile yazdirin
    //
        static void sayilar(int... sayi)
        {
            System.out.println("Argument sayisi: "
                    + sayi.length);


            for (int each : sayi)
                System.out.print(each + " ");
            System.out.println();
        }


        public static void main(String args[])
        {


            // tek parametreli
            sayilar(100);

            // 4 parametreli
            sayilar(1, 2, 3, 4);

            // parametresiz
            sayilar();
        }
    }


