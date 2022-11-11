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
public class filmbioskop {
    public static void main(String[] args) {
    //membuat variabel dan Scanner
    String umur;
    Scanner bioskop = new Scanner(System.in);

    //menampilkan output ke user
    System.out.println("Masukkan umur ");
    umur = bioskop.nextLine();

    //membuat kondisi
    switch(umur){
        case "3" :
            System.out.println("Menonton Film Barbie ");
            break;

        case "7" :
            System.out.println("Menonton Film Keluarga Cemara");
            break;

        case "9" :
            System.out.println("Menonton Film Miinions ");
            break;

        case "15" :
            System.out.println("Menonton Film Mariposa");
            break;

        case "18" :
            System.out.println("Menonton Film Dilan 1990");
            break;

        case "20" :
            System.out.println("Menonton Film Mouse");
            break;

        default: 
            System.out.println("Menonton Film The Penthouse");
        }
    }
}
    

