package scanner01;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {
        //Kullanıcıdan ismini ve soyismini isteyip aşağıdaki şekilde yazdıran
        //İsminiz :Erdem Can
        //Soyisminiz: Yılmaz
        //Kursumuza katılımınız alınmıştır, teşekkür ederiz.

        Scanner input = new Scanner(System.in);
        System.out.println("Adınızı yazınız:" );
        String name = input.nextLine();
        System.out.println("Soyadınızı yazınız:" );
        String surname = input.nextLine();
        System.out.println(name +" "+ surname +" " + "Kursa katılımınız alınmıştır,teşekkür ederiz:)");
    }
}
