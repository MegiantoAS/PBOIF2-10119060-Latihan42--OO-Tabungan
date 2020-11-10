/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan42.oo.tabungan;
import java.util.Scanner;
/**
 *
  @author Megianto Adi saputra
 * Nama         : Megianto Adi Saputra
 * Kelas        : IF-2
 * NIM          : 10119060
 * Deskripsi    : Program Menghitung Tabungan
 */
public class PBOIF210119060Latihan41OOTabungan {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int jumlahAmbil;
        System.out.println("=====Program Penarikan Uang=====");
        System.out.printf("Masukan Saldo Awal : ");
        
        Tabungan tabungan = new Tabungan(input.nextInt());
        System.out.printf("Jumlah Uang yang Diambil : ");
        jumlahAmbil = tabungan.ambilUang(input.nextInt());
        System.out.println("Saldo Anda Sekarang : "+jumlahAmbil);
    }
    
}
