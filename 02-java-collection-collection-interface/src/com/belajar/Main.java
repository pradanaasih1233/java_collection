// JAVA COLLECTION INTERFACE

/*------------------------------------------------------------
*| JAVA COLLECTION INTERFACE
*|------------------------------------------------------------
*| - Selain iterable interface, parent class semua collection
*|   di java adalah collection.
*| - Kalau iterable interface digunakan sebagai kontrak untuk
*|   mengiterasi data secra sequnsial.
*| - Collection merupakan kontrak untuk memanipulasi data
*|   collection, seperti menambah, menghapus dan menge-
*|   cek isi data collection.
*| - Tidak ada direct implementation untuk collection, karena
*|   collection nanti akan dibagi lagi menjadi List, Set dan
*|   Queue.
*|
*/

package com.belajar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 02 JAVA COLLECTION");

        // membuat collection.
        System.out.println("\nMEMBUAT DATA COLLECTION...");
        Collection<String> namaKeluarga = new ArrayList<>();

        // menambah data ke dalam collection.
        System.out.println("\nMENAMBAH DATA...");
        namaKeluarga.add("joko");
        namaKeluarga.add("katon");
        namaKeluarga.addAll(List.of("pratinah","intan","tejo"));

        // menampilkan data ke dalam console.
        System.out.println("\nMENAMPILKAN DATA");
        for (var nama : namaKeluarga ) {
            System.out.println(nama);
        }

        // menghapus data.
        System.out.println("\nMENGHAPUS DATA...");
        if( namaKeluarga.remove("joko")) {
            // bila data tidak ada, tidak akan ada pengaruh.
            System.out.println("joko di coret dari kk");
        } else {
            System.out.println("joko bukan keluarga kita...");
        }

        if( namaKeluarga.remove("tejo")) {
            // bila data tidak ada, tidak akan ada pengaruh.
            System.out.println("tejo di coret dari kk");
        } else {
            System.out.println("tejo bukan keluarga kita...");
        }

        // menampilkan data ke dalam console.
        System.out.println("\nMENAMPILKAN DATA");
        for (var nama : namaKeluarga ) {
            System.out.println(nama);
        }
        System.out.println("joko dan tejo jadi anak terlantar...");

        // cek data apakah ada dalam collection.
        System.out.println("\nCEK DATA APAKAH ADA");
        if (namaKeluarga.contains("intan")){
            System.out.println("intan adalah keluarga kita");
        } else {
            System.out.println("intan bukan keluarga kita");

        }if (namaKeluarga.containsAll(List.of("intan","katon"))){
            System.out.println("intan dan katon adalah keluarga kita");
        } else {
            System.out.println("intan dan katon bukan keluarga kita");
        }

        // jumlah data dalam collection.
        System.out.println("\nJUMLAH DATA DALAM COLLECTION...");
        System.out.println(namaKeluarga.size());
    }
}