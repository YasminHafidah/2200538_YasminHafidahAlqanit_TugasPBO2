package OperasiMatematika_Genap;

import java.util.Scanner;

public class OperasiMatematika {
    public static void main(String[] args) {
        float angka1;
        float angka2;
        float angka3;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Bilangan Pertama :");
        angka1 = input.nextFloat();
        
        System.out.println("Masukkan Bilangan Kedua :");
        angka2 = input.nextFloat();
        
        System.out.println("Masukkan Bilangan Ketiga :");
        angka3 = input.nextFloat();
        
        System.out.println("Hasil Penjumlahan ketiga bilangan : " + (angka1+angka2+angka3));
        System.out.println("Hasil Pengurangan ketiga bilangan : " + (angka1-angka2-angka3));
        System.out.println("Hasil Perkalian ketiga bilangan : " + (angka1*angka2*angka3));
        System.out.println("Hasil Pembagian ketiga bilangan : " + (angka1/angka2/angka3));
    }
    
}
