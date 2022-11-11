/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PERSONAL
 */
public class Keramik {
    private int luas_tanah;
    private int kerA_p;
    private int kerA_l;
    private int kerB_p;
    private int kerB_l;
    private int kerC_p;
    private int kerC_l;

    //Luas Tanah yang ada
    public void setLuasTanah(int l) {
        luas_tanah = l;
    }
    public int getLuasTanah() {
        return luas_tanah;
    }
    
    //Dus merek A
    public void setPanjangA(int pA) {
        kerA_p = pA;
    }
    public int getPanjangA() {
        return kerA_p;
    }
    public void setLebarA(int lA) {
        kerA_l = lA;
    }
    public int getLebarA() {
        return kerA_l;
    }
    public int luasKerA() {
        int luasA;
        luasA = kerA_p * kerA_l / 100 ;
        return luasA;
    }
    public int isiKerA() {
        int isiA;
        isiA = 25;
        return isiA;
    }
    public int hargaKerA() {
        int hargaA;
        hargaA = 40000;
        return hargaA;
    }
    public int luasTotKerA() {
        int totalA;
        totalA = luasKerA() * isiKerA();
        return totalA;
    }
    
    
    //Dus merek B
    public void setPanjangB(int pB) {
        kerB_p = pB;
    }
    public int getPanjangB() {
        return kerB_p;
    }
    public void setLebarB(int lB) {
        kerB_l = lB;
    }
    public int getLebarB() {
        return kerB_l;
    }
    public int luasKerB() {
        int luasB;
        luasB = kerB_p * kerB_l / 100 ;
        return luasB;
    }
    public int isiKerB() {
        int isiB;
        isiB = 11;
        return isiB;
    }
    public int hargaKerB() {
        int hargaB;
        hargaB = 60000;
        return hargaB;
    }
    public int luasTotKerB() {
        int totalB;
        totalB = luasKerB() * isiKerB();
        return totalB;
    }
    
    
    //Dus merek C
    public void setPanjangC(int pC) {
        kerC_p = pC;
    }
    public int getPanjangC() {
        return kerC_p;
    }
    public void setLebarC(int lC) {
        kerC_l = lC;
    }
    public int getLebarC() {
        return kerC_l;
    }
    public int luasKerC() {
        int luasC;
        luasC = kerC_p * kerC_l / 100 ;
        return luasC;
    }
    public int isiKerC() {
        int isiC;
        isiC = 6;
        return isiC;
    }
    public int hargaKerC() {
        int hargaC;
        hargaC = 70000;
        return hargaC;
    }
    public int luasTotKerC() {
        int totalC;
        totalC = luasKerC() * isiKerC();
        return totalC;
    }
    
    
    //info tribut keramik
    public void infoKeramik(){
        System.out.println("Luas Tanah = " +getLuasTanah()+ " m2");
        System.out.println("");
        System.out.println("Keramik Merek A");
        System.out.println("Panjang = "+getPanjangA()+" cm");
        System.out.println("Lebar = "+getLebarA() +" cm");
        System.out.println("Luas Keramik = "+luasKerA()+ " m2");
        System.out.println("Isi Keramik = "+isiKerA()+" keping");
        System.out.println("Harga Satuan Dus = Rp. "+hargaKerA());
        System.out.println("Total Luas Keramik dalam Satuan Dus = " +luasTotKerA()+" m2");
        System.out.println("");
        System.out.println("Keramik Merek B");
        System.out.println("Panjang = "+getPanjangB()+" cm");
        System.out.println("Lebar = "+getLebarB() +" cm");
        System.out.println("Luas Keramik = "+luasKerB()+ " m2");
        System.out.println("Isi Keramik = "+isiKerB()+" keping");
        System.out.println("Harga Satuan Dus = Rp. "+hargaKerB());
        System.out.println("Total Luas Keramik dalam Satuan Dus = " +luasTotKerB()+" m2");
        System.out.println("");
        System.out.println("Keramik Merek C");
        System.out.println("Panjang = "+getPanjangC()+" cm");
        System.out.println("Lebar = "+getLebarC() +" cm");
        System.out.println("Luas Keramik = "+luasKerC()+ " m2");
        System.out.println("Isi Keramik = "+isiKerC()+" keping");
        System.out.println("Harga Satuan Dus = Rp. "+hargaKerC());
        System.out.println("Total Luas Keramik dalam Satuan Dus = " +luasTotKerC()+" m2");
    }
    public int hitungDusA() {
        int dusA;
        dusA = getLuasTanah() * luasTotKerA();
        return dusA;
    }
    public int hitungHargaA() {
        int hargaA;
        hargaA = hitungDusA() * hargaKerA();
        return hargaA;
    }
    public int hitungDusB() {
        int dusB;
        dusB = getLuasTanah() * luasTotKerB();
        return dusB;
    }
    public int hitungHargaB() {
        int hargaB;
        hargaB = hitungDusB() * hargaKerB();
        return hargaB;
    }
    
    //Jumlah dus dan harga keramik yang dibutuhkan merek C
    public int hitungDusC() {
        int dusC;
        dusC = getLuasTanah() * luasTotKerC();
        return dusC;
    }
    public int hitungHargaC() {
        int hargaC;
        hargaC = hitungDusC() * hargaKerC();
        return hargaC;
    }
    
    //informasi jumlah dus dan harga yang dibutuhkan pada masing masing merek
    public void hitungHarga(){
        System.out.println("");
        System.out.println("Berikut Informasi Dus dan Harga pada Masing-masing Merek : ");
        System.out.println("");
        System.out.println("Merek A");
        System.out.println("Jumlah Dus yang Dibutuhkan "+hitungDusA()+" buah");
        System.out.println("Anggaran yang Perlu Dipersiapkan Rp. "+hitungHargaA());
        System.out.println("");
        System.out.println("Merek B");
        System.out.println("Jumlah Dus yang Dibutuhkan "+hitungDusB()+" buah");
        System.out.println("Anggaran yang Perlu Dipersiapkan Rp. "+hitungHargaB());
        System.out.println("");
        System.out.println("Merek C");
        System.out.println("Jumlah Dus yang Dibutuhkan "+hitungDusC()+" buah");
        System.out.println("Anggaran yang Perlu Dipersiapkan Rp. "+hitungHargaC());
    }
    
}
    
}
