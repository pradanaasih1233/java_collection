// JAVA LIST INTERFACE

/*------------------------------------------------------------
*| JAVA LIST INTERFACE
*|------------------------------------------------------------
*| - SIFAT LIST :
*|   - Element bisa duplikat.
*|   - Urutan data sesuai data yang kita masukan.
*|   - List memiliki index.
*|   - List adalah data dinamic yang bisa membesar dan mengkecil
*|     otomatis.
*| - list adalah interface dan ada beberapa implementasinya.
*|------------------------------------------------------------
*| - IMPLEMENTASI LIST
*|
*|      INTERABLE
*|          |
*|      COLLECTION
*|          |
*|      ___LIST____
*|     |           |
*|  ARRAYLIST   LINKEDLIST
*|------------------------------------------------------------
*| - ARRAYLIST CLASS
*|   - ArrayList adalah implementasi dari List menggunakan array.
*|   - Default kapasitas array di ArrayList adalah 10.
*|   - Tapi bila kita memasukan data sudah penuh, maka otomatis
*|     Array list akan membuat array baru dengan kapasitas baru
*|     dengan ukuran lama + data baru.
*|
*| - LIKEDLIST CLASS
*|   - LinkList adalah implementasi List dengan struktur data
*|     Double Linked List.
*|
*|      HEAD -> NEXT -> NEXT -> NEXT -> NEXT -> NULL
*|           |_      |_      |_      |_      |_
*|  DATA     |A|     |B|     |C|     |D|     |E|
*|            |       |       |       |       |
*|      NULL <- PREV <- PREV <- PREV <- PREV <-
*|------------------------------------------------------------
*| - PERBANDIGAN ARRAYLIST DAN LINKEDLIST
*|
*|  OPERASI    |  ARRAYLIST          |  LINKEDLIST
*|  ----------------------------------------------
*|  - add      | cepat bila kosong   | cepat
*|  - get      | cepat dengan index  | lamabt karena hrs cek node
*|  - set      | cepat dengan index  | lambat karena hrs cek node
*|  - remove   | lamabat oleh geser  | cepat karena ada prev
*|
*|------------------------------------------------------------
*/

package com.belajar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 02 JAVA COLLECTION LIST INTERFACE");

        // membuat collection.
        System.out.println("\nMEMBUAT DATA COLLECTION...");
        List<String> namaKeluarga = new ArrayList<>();

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

        //------------------------------------------------------------
        List<String> namaKeluarga2 = new LinkedList<>();

        namaKeluarga2.add("joko");
        namaKeluarga2.add("katon");

        // menambah data ke dalam collection.
        namaKeluarga2.addAll(List.of("pratinah","intan","tejo"));
        System.out.println("\nMENAMBAH DATA...");

        // menampilkan data ke dalam console.
        System.out.println("\nMENAMPILKAN DATA");
        for (var nama : namaKeluarga2 ) {
            System.out.println(nama);
        }

        // menghapus data.
        System.out.println("\nMENGHAPUS DATA...");
        if( namaKeluarga2.remove("joko")) {
            // bila data tidak ada, tidak akan ada pengaruh.
            System.out.println("joko di coret dari kk");
        } else {
            System.out.println("joko bukan keluarga kita...");
        }

        if( namaKeluarga2.remove("tejo")) {
            // bila data tidak ada, tidak akan ada pengaruh.
            System.out.println("tejo di coret dari kk");
        } else {
            System.out.println("tejo bukan keluarga kita...");
        }

        // menampilkan data ke dalam console.
        System.out.println("\nMENAMPILKAN DATA");
        for (var nama : namaKeluarga2 ) {
            System.out.println(nama);
        }
        System.out.println("joko dan tejo jadi anak terlantar...");

        // cek data apakah ada dalam collection.
        System.out.println("\nCEK DATA APAKAH ADA");
        if (namaKeluarga2.contains("intan")){
            System.out.println("intan adalah keluarga kita");
        } else {
            System.out.println("intan bukan keluarga kita");

        }if (namaKeluarga2.containsAll(List.of("intan","katon"))){
            System.out.println("intan dan katon adalah keluarga kita");
        } else {
            System.out.println("intan dan katon bukan keluarga kita");
        }

        // jumlah data dalam collection.
        System.out.println(namaKeluarga2.size());
        System.out.println("\nJUMLAH DATA DALAM COLLECTION...");
    }
}
