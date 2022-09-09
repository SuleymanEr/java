package replit;

public class ENG_If_Switch_Ternary_StringMeth_7 {
    public static void main(String[] args) {

     /*  reate 2 words : name1 and name2
 if the name1 has even numbers of characters,
then insert the second word in the middle of the first name
if the first word has odd numbers
Then print the “Name2 cannot be inserted in the name1”
e.g:
name1= mehmet
name2= ahmet
 Print ==> mehahmetmet
       `*/

        String name1="Mualla";
        String name2="selim";
        String ilkYarimname1="";


        if(name1.length()%2==0 ){

            ilkYarimname1=name1.substring(0,name1.length()/2);
            System.out.println("name1: "+name1);
            System.out.println("name2: "+name2);
            System.out.println("birlestikten sonraki kelime: "+ilkYarimname1+name2+ name1.substring(name1.length()/2));

        } else  {
            System.out.println("Girdiginiz ilk ismin uzunlugu cift bir sayi olmadigi icin isim2 isim1 in ortasina yerlestirilemiyor");


        }

    }
}
