package VucutKitleIndeksi;

import java.util.Scanner;

public class VKIHesaplama {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double boy, kilo, vKI;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = sc.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz (kilogram cinsinden) : ");
        kilo = sc.nextDouble();

        vKI = kilo / (boy * boy);

        System.out.println("Boy : " + boy);
        System.out.println("Kilo : " + kilo);
        System.out.print("Vücut Kitle İndeksiniz : " + vKI);

    }
}
