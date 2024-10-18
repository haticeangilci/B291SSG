package scanner01;

import java.util.Scanner;

public class C01_scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayıyı yazınız: ");
        double s = input.nextDouble();
        int sayı = (int) s;
        System.out.println(sayı);
    }
}
