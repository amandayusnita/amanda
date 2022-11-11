/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanconditionalstatement;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Diskon {
    public static void main(String[] args) {
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Diskon Potongan Harga ##");
    System.out.println("========================================");
    System.out.println();
     
    int total_belanja;
    double harga_akhir;
     
    System.out.print("Total Belanja: Rp.");
    total_belanja = input.nextInt();
    System.out.println();
     
    if (total_belanja >= 100000)  {
      harga_akhir = total_belanja - 10000;
      System.out.println("Selamat, anda mendapat diskon 10000");
    }
    else if (total_belanja >= 1500000) {
      harga_akhir = total_belanja - 20000;
      System.out.println("Selamat, anda mendapat diskon 20000");
    }
    else if (total_belanja >= 3000000) {
      harga_akhir = total_belanja - 50000;
      System.out.println("Selamat, anda mendapat diskon 50000");
    } else if (total_belanja >= 500000){
         harga_akhir = total_belanja - 75000;
      System.out.println("Selamat, anda mendapat diskon 75000");
    }
    else {
      harga_akhir = total_belanja;
    }
  
  System.out.println("Total bayar: Rp."+ harga_akhir);
 
    }
}

    

