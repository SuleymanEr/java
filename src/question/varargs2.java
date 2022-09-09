package question;

public class varargs2 {

    static void kelime(String... str) {
        System.out.println("Hava cok güzel ");
    }

    public static void main(String args[]) {

        kelime();// 0 Argument
        kelime("patlican", "araba", "kus", "balik");// 4 Argument
    }
}

