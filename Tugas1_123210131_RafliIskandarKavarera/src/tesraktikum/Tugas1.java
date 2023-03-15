/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesraktikum;

import BangunRuang.Balok;
import BangunRuang.Tabung;
import java.util.Scanner;

/**
 *
 * @author rafli
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String tes="tes";
        System.out.println(tes);
        //MainForm mf = new MainForm();
        System.out.println("Pilih menu :\n1. Balok Persegi Panjang\n2. Tabung Lingkaran");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a==1){
            System.out.print("Panjang : ");
            double panjang = sc.nextDouble();
            System.out.print("Lebar : ");
            double lebar = sc.nextDouble();
            System.out.print("Tinggi : ");
            double tinggi = sc.nextDouble();
            Balok balok = new Balok(tinggi,lebar,panjang);
            System.out.println("Volume : "+ balok.GetVolume());
            System.out.println("Luas Permukaan : " + balok.GetLuasPermukaan());
            System.out.print("\nPersegi Panjang\n");
            System.out.println("Luas : "+ balok.GetLuas());
            System.out.println("Keliling : "+ balok.GetKeliling());
        }
        else if(a==2){
            System.out.print("Jari-Jari : ");
            double jari = sc.nextDouble();
            System.out.print("Tinggi : ");
            double tinggi = sc.nextDouble();
            Tabung tabung = new Tabung(tinggi, jari);
            System.out.println("Volume : "+ tabung.GetVolume());
            System.out.println("Luas Permukaan : " + tabung.GetLuasPermukaan());
            System.out.println("\nLingkaran\n");
            System.out.println("Luas : "+ tabung.GetLuas());
            System.out.println("Keliling : "+ tabung.GetKeliling());
        }
    }
    
}
