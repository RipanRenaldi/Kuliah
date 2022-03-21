package com.company.gaji;

public class Manajer extends Pegawai{
    private double tunjanganJabatan;
    public Manajer(){
        super(true);
    }

    @Override
    public void kerja(){
        this.posisi = "Manajer";
        this.jmlJamKerja = 50;
        System.out.println("Jumlah Jam Kerja : " + this.posisi + " per minggu "+this.jmlJamKerja);


    }
    @Override
    public double getGaji(){
        return ((super.getGaji() + 1000000) * 0.075) * this.jmlJamKerja * 4;
    }

    public double getGaji(int jamLembur){
        return this.getGaji() + (jamLembur * 35000);
    }

}
