package com.company.gaji;

import java.util.ArrayList;

public class Departemen {
    private String namaDepartemen;
    private ArrayList<Pegawai> daftarList = new ArrayList<>();

    public String getNamaDept(){
        return this.namaDepartemen;
    }

    public void setNamaDept(String namaDept){
        this.namaDepartemen = namaDept;
    }

    public void setDaftarPegawai(Pegawai pegawai){
        daftarList.add(pegawai);
    }

    public ArrayList<Pegawai> getDaftarPegawai(){
        return this.daftarList;
    }


}
