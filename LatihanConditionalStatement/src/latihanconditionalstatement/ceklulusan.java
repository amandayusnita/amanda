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
public class ceklulusan {
    public static void main(String[] args) {
        //membuat variabel
        int nilai;
        String nama;
        
        //membuat scanner
        Scanner kelulusan = new Scanner(System.in);
        System.out.println("Masukkan nama anda : ");
        nama = kelulusan.nextLine();
        
        System.out.println("Berapa nilai anda ? ");
        nilai = kelulusan.nextInt();
        
        //membuat kondisi
        if (nilai >= 0 && nilai <= 60) {
            System.out.println("Maaf "+ nama + " anda tidak lulus");
            System.out.println("Dengan nilai E");
        } else if (nilai >= 61 && nilai <= 70){
            System.out.println("Maaf "+ nama + " anda tidak lulus");
            System.out.println("Dengan nilai D");
        } else if (nilai >= 71 && nilai <= 80){
            System.out.println("Selamat "+ nama + " anda lulus");
            System.out.println("Dengan nilai C");
        } else if (nilai >= 81 && nilai <= 90){
            System.out.println("Selamat "+ nama + " anda lulus");
            System.out.println("Dengan nilai B");
        }else {
            System.out.println("Selamat "+ nama + " anda lulus");
            System.out.println("Dengan nilai A");
        }
    }
}

    

