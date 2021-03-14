// Muhammad Naufal Firdana Trisya
// A11.2019.11671
// 4423

package Main;

import java.util.Scanner;

public class main {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Angka pertama :");
        int a = input.nextInt();

        System.out.println("angaka kedua:");
        int b = input.nextInt();

        int tambah = a + b ;
        int kurang = a - b;
        int kali = a*b;
        double bagi = a/b;

        System.out.println("\n Penjumlahan:"+ tambah);
        System.out.println("\n Pengurangan:"+ kurang);
        System.out.println("\n Perkalian:"+ kali);
        System.out.println("\n Pembagian:"+ bagi);


    }

}
