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
public class prminjamanbuku {
    public static void main(String[] args) {
        //membuat variabel
         int pilihan, jumlahbuku, jumlahbuku1 = 0, jumlahbuku2, harga, diskon = 0;
        
        //membuat Scanner
        Scanner peminjaman = new Scanner(System.in);
        
        //menampilan output ke user
        System.out.println("Masukan Jumlah Buku sesuai pinjaman :");
        pilihan = peminjaman.nextInt();
        
        switch(pilihan){
            case 1 :
                System.out.println("Anda akan meminjam buku masukan jumlah pinjaman buku");
                jumlahbuku = peminjaman.nextInt();
                harga = 10000*jumlahbuku;
                System.out.println("Harga pinjam buku = Rp. "+harga);
            break;
            
            case 2 :
                System.out.println("Anda akan meminjam buku  masukan jumlah pinjaman buku");
                jumlahbuku = peminjaman.nextInt();
                harga = 20000;
                System.out.println("Harga pinjam buku = Rp. "+harga);
            break;
            
            case 3 :
                System.out.println("Anda akan meminjam buku  masukan jumlah pinjaman buku");
                jumlahbuku = peminjaman.nextInt();
                harga = 30000;
                System.out.println("Harga pinjam buku = Rp. "+harga);
            break;
            
            case 4 :
                System.out.println("Anda akan meminjam buku  masukan jumlah pinjaman buku");
                jumlahbuku = peminjaman.nextInt();
                harga = 30000;
                System.out.println("Harga pinjam buku = Rp. "+harga);
                if (jumlahbuku % 2.5/100 >= 0) {
                    jumlahbuku1 = (int) (jumlahbuku % 2.5/100);}
                jumlahbuku2 = jumlahbuku + jumlahbuku1;
                
                if (harga >29000) {
                    diskon = (int) (harga * 2.5/100);
                    harga = harga-diskon;
                    System.out.println("Jumlah buku yang didapat anda mendapat diskon 2.5% Rp. " +diskon);
                }
                System.out.println("Jumlah buku yang didapat "+jumlahbuku2);
                System.out.println("Selamat anda cukup membayar Rp. "+harga );
                break;
                
                case 5 :
                System.out.println("Anda akan meminjam buku  masukan jumlah pinjaman buku");
                jumlahbuku = peminjaman.nextInt();
                harga = 50000;
                System.out.println("Harga pinjam buku = Rp. "+harga);
                if (jumlahbuku % 5/100 >= 0) {
                    jumlahbuku1 = (int) (jumlahbuku % 5/100);}
                jumlahbuku2 = jumlahbuku + jumlahbuku1;
                
                if (harga >49000) {
                    diskon = (int) (harga * 5/100);
                    harga = harga-diskon;
                    System.out.println("Jumlah buku yang didapat anda mendapat diskon 5% Rp. " +diskon);
                }
                System.out.println("Jumlah buku yang didapat "+jumlahbuku2);
                System.out.println("Selamat anda cukup membayar Rp. "+harga );
                break;
                
                case 10 :
                System.out.println("Anda akan meminjam buku  masukan jumlah pinjaman buku");
                jumlahbuku = peminjaman.nextInt();
                harga = 100000;
                System.out.println("Harga pinjam buku = Rp. "+harga);
                if (jumlahbuku % 10/100 >= 0) {
                    jumlahbuku1 = (int) (jumlahbuku % 2.5/100);}
                jumlahbuku2 = jumlahbuku + jumlahbuku1;
                
                if (harga >99000) {
                    diskon = (int) (harga * 10/100);
                    harga = harga-diskon;
                    System.out.println("Jumlah buku yang didapat anda mendapat diskon 10% Rp. " +diskon);
                }
                System.out.println("Jumlah buku yang didapat "+jumlahbuku2);
                System.out.println("Selamat anda cukup membayar Rp. "+harga );
                break;
            }
        }
    }
    

