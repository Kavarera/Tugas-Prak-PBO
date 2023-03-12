/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BangunRuang;

import tesraktikum.BangunBidang.Lingkaran;
import tesraktikum.Interface.MenghitungRuang;

/**
 *
 * @author rafli
 */
public class Tabung extends Lingkaran implements MenghitungRuang {

    final private double tinggi;
    public Tabung(double tinggi, double j){
        super(j);
        this.tinggi=tinggi;
    }
    
    @Override
    public double GetLuasPermukaan() {
        return GetLuas()*tinggi;
    }

    @Override
    public double GetVolume() {
        return 2*GetLuas()+GetKeliling()*tinggi;
    }
    
}
