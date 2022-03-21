package com.company.gaji;

public class Pegawai {
    private String namaPegawai;
    protected String posisi;
    private int nipPegawai;
    private double gaji;
    protected int jmlJamKerja;
    protected boolean pegawaiTetap;

    Pegawai(boolean pegawaiTetap){
        this.pegawaiTetap = pegawaiTetap;
    }
    public void kerja(){
        System.out.println("Bekerja Selama" + this.jmlJamKerja);
    }
    public String getPosisi(){
        return this.posisi;
    }
    public int getNipPegawai(){
        return this.nipPegawai;
    }
    public int getJmlJamKerja(){
        return this.jmlJamKerja;
    }

    public boolean getStatusPegawai(){
        return this.pegawaiTetap;
    }


    public double getGaji(){
        return this.gaji;
    }

    public void setNamaPegawai(String nama){
        this.namaPegawai = nama;
    }

    public void setNip(int nip){
        this.nipPegawai = nip;
    }

    public void setGaji(double Gaji){
        this.gaji = Gaji;
    }

    public String getNamaPegawai(){
        return this.namaPegawai;
    }

}
