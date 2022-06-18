/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo7;

/**
 *
 * @author Dell
 */
public class Main {

    public static void main(String[] args) {

            PegawaiTetap pT1 = new PegawaiTetap("RARA", "3506233443876521373782", 6400000);
            PegawaiTetap pT2 = new PegawaiTetap("LAILA", "3506233443876521373738", 4000000);
            PegawaiTetap pT3 = new PegawaiTetap("SUPRI", "3506233443876521373725", 5200000);
            System.out.println(pT1.toString());
            System.out.println(pT2.toString());
            System.out.println(pT3.toString());

            PegawaiHarian pH1 = new PegawaiHarian("AYUS", "3506233456823695373763", 6600, 35);
            PegawaiHarian pH2 = new PegawaiHarian("DIKA", "3506233456823695373725", 5500, 40);
            PegawaiHarian pH3 = new PegawaiHarian("NAJWA", "3506233456823695373747", 5000, 45);
            System.out.println(pH1.toString());
            System.out.println(pH2.toString());
            System.out.println(pH3.toString());

            Sales sL1 = new
                    Sales("ALYA", "3503233443876521387658", 45, 50000);
            Sales sL2 = new
                    Sales("LINDA", "3503233443876521387637", 50, 55000);
            Sales sL3 = new
                    Sales("DIDIN", "3503233443876521387654", 35, 45000);
            System.out.println(sL1.toString());
            System.out.println(sL2.toString());
            System.out.println(sL3.toString());
        }
    }