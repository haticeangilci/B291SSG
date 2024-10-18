package scanner01;

import java.util.Scanner;

public class C02_scanner {
    public static void main(String[] args) {
        //Soru: Kullanıcıdan iki tamsayı alıp bu sayıların
        //toplam,fark ve çarpımlarını yazdırın.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen iki tane sayı giriniz:" );
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        //toplam
        System.out.println("Toplam = " + (sayi2+sayi1));
        System.out.println("Fark = " + (sayi2-sayi1));
        System.out.println("Çarpım = " + (sayi2*sayi1));
        System.out.println("Bölüm = " + (sayi2/sayi1));


    }
}
