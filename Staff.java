package com.company.gaji;

public class Staff extends Pegawai{

    Staff(boolean pegawaiTetap){
        super(pegawaiTetap);
        this.pegawaiTetap = pegawaiTetap;
    }

    @Override
    public void kerja(){
        this.posisi = "staff";
        this.jmlJamKerja = 40;
        System.out.println("Jumlah Jam Kerja "+ this.posisi + " per minggu "+this.jmlJamKerja);
    }

    @Override
    public double getGaji(){
        double gaji = 0;
        if(this.pegawaiTetap == true){
             gaji = super.getGaji() * 0.05;
        }else if(this.pegawaiTetap == false) {
            gaji = super.getGaji() * 0.025;
        }
        return (gaji * this.jmlJamKerja) * 4 ;
    }
    public double getGaji(int jamLembur){
        double gaji = 0;
        if(this.pegawaiTetap == true){
            gaji = this.getGaji() + (jamLembur * 25000);
        }else if(this.pegawaiTetap == false){
            gaji = this.getGaji() + (jamLembur * 15000);
        }
        return gaji;
    }



}
