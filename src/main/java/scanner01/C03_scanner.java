package scanner01;

import java.util.Scanner;

public class C03_scanner {
    public static void main(String[] args) {
        //Kullanıcıdan tek bir karakter alıp yazdırınız.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen tek bir karakter giriniz.");
        char chr = input.next().charAt(0);//ali can
        System.out.println(chr);
    }
}
