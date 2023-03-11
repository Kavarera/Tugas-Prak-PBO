/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunRuang;

import tesraktikum.BangunBidang.PersegiPanjang;
import tesraktikum.Interface.MenghitungRuang;

/**
 *
 * @author rafli
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{
    
    private double tinggi;
    Balok(double tinggi,double lebar,double panjang){
        super(lebar,panjang);
        this.tinggi = tinggi;
    }

    @Override
    public double GetLuasPermukaan() {
        return GetLuas()*tinggi;
    }

    @Override
    public double GetVolume() {
        return 2 * (super.GetLuas() * getPanjang() + GetLuas() * getLebar() + getPanjang() * tinggi + getLebar() * tinggi);
    }
    
}
