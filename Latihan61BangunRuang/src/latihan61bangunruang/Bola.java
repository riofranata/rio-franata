/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan61bangunruang;

/**
 *
 * @author Aero
 */
public class Bola extends BangunRuang {
    
    private double r;
    private double volume;

    @Override
    public double hitungVolume() {
        volume = (4*Math.PI*Math.pow(r, 3))/3;
        
        return volume;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    
    
}
