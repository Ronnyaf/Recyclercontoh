package com.example.recyclercontoh;

public class kumpulandata {

    String Nama,isi;

    public kumpulandata() {
    }

    public kumpulandata(String nama, String isi) {
        this.Nama = nama;
        this.isi = isi;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
}
