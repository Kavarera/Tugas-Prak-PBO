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
public class PersegiPanjang implements MenghitungBidang {
    private final double panjang;
    private final double lebar;
  
    public PersegiPanjang(double d,double a){
        this.panjang =d;
        this.lebar=a;
    }
    
    public double getPanjang(){
        return this.panjang;
    }
    
    public double getLebar(){
        return this.lebar;
    }

    @Override
    public double GetKeliling() {
        return (panjang +lebar) * 2;
    }

    @Override
    public double GetLuas() {
        System.out.println(panjang*lebar);
        return panjang*lebar;
    }
}
