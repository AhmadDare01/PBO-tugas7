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
public class PegawaiTetap extends Pegawai {
    private double upah ;
    public PegawaiTetap(String nama, String noKTP,
                        double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }
    public double getUpah() {
        return upah;
    }
    public void setUpah(double upah) {
        this.upah = upah;
    }
    @Override
    public double gaji(){
        return this.upah ;
    }
    @Override
    public String toString() {
        return "Nama Pegawai Tetap : " +
                this.getNama() + "\n" + super.toString()+ "\n" +
                "Upah : " +upah+"\n" +
                "Pendapatan : Rp"+gaji()+"\n";
    }
}
