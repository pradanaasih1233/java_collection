package com.belajar;


// dalam hal ini, person adalah class yang tidak bisa diubah/buatan orang lain.
public class Person {
    private String nama;

    public Person(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return super.getClass().getCanonicalName() + " Namanya : "+ this.getNama();
    }
}