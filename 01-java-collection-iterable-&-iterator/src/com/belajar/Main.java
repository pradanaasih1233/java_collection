// JAVA COLLECTION ITERABLE DAN ITERATOR

package com.belajar;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nBELAJAR JAVA 01 JAVA COLLECTION ITERABLE & ITERATOR");

        /*------------------------------------------------------------
         *| JAVA COLLECTION ITERABLE
         *|------------------------------------------------------------
         *| - Iterable adalah parent untuk semua collection di java,
         *|   kecuali Map.
         *| - Iterable sangat sederhana digunakan hanya agar mendukung
         *|   for-each loop.
         *| - Karena semua collection pasti implement iterable, secara
         *|   otomatis maka semua collection di java mendukung
         *|   perulangan for-each, jadi bukan cuma Array.
         */

        // ini adalah collection dalam iterable.
        System.out.println("ITERABLE");
        Iterable<String> MyName = List.of("papa","yy","uu");

        for (var name : MyName){
            System.out.println(name);
        }

        /*------------------------------------------------------------
         *| JAVA COLLECTION ITERATOR
         *|------------------------------------------------------------
         *| - For-each di iterable bisa terjadi karena ada method
         *|   iterator.
         *| - Iterator adalah interface yang mengdefinisikan cara kita
         *|   melakukan mengakses element di collection secara sequential.
         *| - For-each sendiri muncul sejak java 5, sebelum java 5 untuk
         *|   melakukan iterasi collection, biasanya dilakukan manual
         *|   menggunakan iterator object.
         */

        // ini adalah collction dalam iterator.
        System.out.println("\nITERATOR");
        Iterator<String> MyName2 = MyName.iterator();

        while (MyName2.hasNext()){
            String SubMyName = MyName2.next();
            System.out.println(SubMyName);
        }
    }
}