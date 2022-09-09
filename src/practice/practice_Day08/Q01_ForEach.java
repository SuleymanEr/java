package practice.practice_Day08;

public class Q01_ForEach {

    // int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17,18};
    // verilen array de once cift olan sayilari, sonra da tek olan sayilari for each loop kullanarak yazdiriniz..

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18};

        System.out.println("Cift sayilar");
        for (int each : arr) {
            if (each % 2 == 0) {
                System.out.println(each + " ");


            }

        }
        System.out.println();

        System.out.println("tek sayilar");
        for (int item : arr) {
            if (item % 2 == 1) {
                System.out.println(item + " ");
            }

        }

    }


}
