package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi;
        double birKmUcret = 0.10, onikiAltiIndirim = 0.50, gencIndirim = 0.10,
                yasliIndirim = 0.30, gidisDonusIndirim = 0.20, toplamUcret;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş-Dönüş ): ");
        yolculukTipi = input.nextInt();

        toplamUcret = mesafe * birKmUcret;

        if ((yas < 0) || (mesafe < 0) || (yolculukTipi < 1) || (yolculukTipi > 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else if (yas < 12) {
            toplamUcret -= (toplamUcret * onikiAltiIndirim);
        } else if (yas < 25) {
            toplamUcret -= (toplamUcret * gencIndirim);
        } else if (yas > 65) {
            toplamUcret -= (toplamUcret * yasliIndirim);
        }
        if (yolculukTipi == 2) {
            toplamUcret -= (toplamUcret * gidisDonusIndirim);
            toplamUcret *= 2;
        }

        System.out.println("Toplam Tutar: " + toplamUcret + " ₺");

    }
}