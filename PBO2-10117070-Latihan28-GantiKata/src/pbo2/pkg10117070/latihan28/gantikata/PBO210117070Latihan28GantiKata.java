/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * Nama                 : Aditya Nur Iskandar
 * Kelas                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program yang berisi tentang mengetahui coding ganti 
 *                        kata dalam kalimat.
 */
public class PBO210117070Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kata;
        String kata2;
        String kata3;
        
        Scanner kt = new Scanner(System.in);
        
        System.out.print("=====Program Mengganti Nama=====");
        System.out.println("");
        System.out.print("Masukkan Kalimat\t: ");
        kata = kt.nextLine();
        System.out.print("Ganti Kata\t: ");
        kata2 = kt.nextLine();
        System.out.print("Menjadi Kata\t: ");
        kata3 = kt.nextLine();
        
        System.out.println("");
        System.out.println("=====Hasil Formatting=====");
        System.out.print("Kalimat Awal\t:"+ kata);
        String kataAkhir = kata.replace(kata2, kata3);
        System.out.println("");
        System.out.print("Kalimat Baru\t:"+kataAkhir);
    }
    
}
