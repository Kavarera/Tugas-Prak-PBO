/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesraktikum.BangunBidang;

import tesraktikum.Interface.MenghitungBidang;

/**
 *
 * @author rafli
 */
public class Lingkaran implements MenghitungBidang {
    private final double jari2;
    public Lingkaran(double j){
        this.jari2=j;
    }
    
    @Override
    public double GetKeliling() {
        return Math.PI * jari2 * 2;
    }

    @Override
    public double GetLuas() {
        return Math.pow(jari2,2)*Math.PI;
    }
}
