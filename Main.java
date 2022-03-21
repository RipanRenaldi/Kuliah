package com.company.gaji;

public class Main{
    public static void main(String[] args){
        Departemen finance = new Departemen();
        finance.setNamaDept("PT Leveruni");


        Manajer betty = new Manajer();
        betty.setNamaPegawai("Betty");
        betty.setNip(12343);
        betty.kerja();
        betty.setGaji(5000000);
        System.out.println("Gaji yang didapat oleh " + betty.getNamaPegawai() + " adalah : "+betty.getGaji());

        Staff ripan = new Staff(true);
        ripan.setNamaPegawai("Ripan");
        ripan.kerja();
        ripan.setGaji(200000);
        System.out.println("Gaji yang didapat oleh "+ ripan.getNamaPegawai() + " Adalah "+ ripan.getGaji());
        ripan.setNip(12345);


        Staff dimas = new Staff(false);
        dimas.setNamaPegawai("Dimas");
        dimas.setNip(12346);
        dimas.kerja();
        dimas.setGaji(200000);
        System.out.println("Gaji yang didapat oleh "+ dimas.getNamaPegawai() + " Adalah "+ dimas.getGaji());

        System.out.println("Gaji yang didapat oleh " + betty.getNamaPegawai() + " adalah : "+betty.getGaji(10));
        System.out.println("Gaji yang didapat oleh "+ dimas.getNamaPegawai() + " Adalah "+ dimas.getGaji(10));
        System.out.println("Gaji yang didapat oleh "+ ripan.getNamaPegawai() + " Adalah "+ ripan.getGaji(10));


//        finance.setDaftarPegawai(dimas);
//        finance.setDaftarPegawai(ripan);
//        finance.setDaftarPegawai(betty);
//
//        for(Pegawai peg : finance.getDaftarPegawai()){
//            System.out.println("Nama Pegawai : "+peg.getNamaPegawai());
//            System.out.println("Jabatan : " +peg.getPosisi());
//            System.out.println("NIP : "+peg.getNipPegawai());
//            System.out.println("Gaji : " + peg.getGaji());
//            System.out.println("Jumlah Jam Kerja : "+peg.getJmlJamKerja());
//            System.out.println("Pegawai Tetap : "+peg.getStatusPegawai());
//        }







    }
}
