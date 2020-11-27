/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116147.latihan63.gradiengarislurus;

/**
 *
 * @author
 * Nama      : Garry Prang
 * Kelas     : PBO-2
 * NIM       : 10116147
 * Deskripsi : Program untuk menghitung gradien garis lurus.
 *
 */
public class Koordinat implements GarisLurus 
{
    private int x1, y1, x2, y2;
    
    public Koordinat(int x1, int y1, int x2, int y2) 
    {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public int getX1() 
    {
        return x1;
    }

    public int getY1() 
    {
        return y1;
    }

    public int getX2() 
    {
        return x2;
    }

    public int getY2() 
    {
        return y2;
    }
    
    @Override
    public int hitungGradien() {
        return (y2 - y1) / (x2 - x1);
    }
}
