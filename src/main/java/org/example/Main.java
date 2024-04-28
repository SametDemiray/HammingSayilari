package org.example;


//2,3,4,5,6,7,8,9,10,12,15,16,18,20,... gibi 2,3 ve 5'ten başka asal böleni olmayan tamsayılara, HAMMİNG SAYILARI denir.
//Buna göre klavyeden(scanner) girilen 1'den büyük pozitif tam sayının "Hamming sayısı " olup olmadığını yinelemeli fonksiyonla
// kontrol eden program

import java.util.Scanner;

public class Main {

    public static int hamming(int n) {
        if (n % 2 == 0) return hamming(n / 2);
        else if (n % 3 == 0) return hamming(n / 3);
        else if (n % 5 == 0) return hamming(n / 5);
        else if (n == 1) return 1;
        else return 0;

    }


    public static void main(String[] args) {

        int a;
        int h;

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n1'den Büyük Tamsayı : ");
        a = scanner.nextInt();
        h = hamming(a);
        if (h == 1)
            System.out.print("\n Hamming Sayısıdır.\n");
        else
            System.out.print("\n Hamming Sayısı Değildir! \n");
    }

}