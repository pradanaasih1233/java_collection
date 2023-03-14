// JAVA SET INTERFACE

/*------------------------------------------------------------
*| JAVA SET INTERFACE
*|------------------------------------------------------------
*| - Set adalah salah satu collection yang berisikan element
*|   element yang unit, tidak boleh/tidak bisa duplikat.
*| - Set tidak memiliki index sehingga tidak ada jaminan data
*|   akan teurut sesuai waktu.
*| - Set tidak memiliki method baru, hanya menggunakan method
*|   interface parentnya yaitu Collection dan iterable.
*| - Pengambilan data secara iterasi, karena data acak.
*|
*|------------------------------------------------------------
*| - IMPLEMENTASI SET
*|
*|      INTERABLE
*|          |
*|      COLLECTION___________________
*|                                   |
*|                              ____SET___________
*|                             4           4      4
*|                             |           |      |
*|                          ENUMSET     HASHSET   |
*|                                         |      |
*|                                       LINKEHASHDSET
*|------------------------------------------------------------
*| - HASHSET VS LINKEDHASHSET
*|   - Dibelakang HashSet dan LinkedHashSet sebenarnya sama
*|     sama hash table, dimana data disimpan dalam sebuah
*|     hashCode() function.
*|   - Perbedaannya adalah HashSet tidak menjamin data terurut
*|     sesuai urutan waktu, sedangkan LinkedHashSet sebaliknya.
*|   - Urutan data LinkedHashSet dapat dijaga karena mengguna-
*|     kan double linked list.
*|------------------------------------------------------------
*| - ENUMSET
*|   - EnumSet adalah set yang element datanya harus Enum.
*|   - Karena data Enum itu unik, sehingga sangat cocok
*|     menggunakan set dibandingkan list.
*/

package com.belajar;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static enum Gender{
        PRIA, WANITA, TIDAK_DITAMPILKAN
    }
    public static void main(String[] args) {

        System.out.println("BELAJAR JAVA 04 COLLECTION SET INTERFACE");

        // membuat HashSet.
        Set<String> namaKeluarga = new HashSet<>();

        // menambahan data.
        namaKeluarga.add("paijo");
        namaKeluarga.add("subana");
        namaKeluarga.add("panji");
        namaKeluarga.add("tika");
        namaKeluarga.add("rumlah");
        namaKeluarga.add("rumlah"); // data tidak akan duplikat.
        namaKeluarga.add("rumlah"); // data tidak akan duplikat.

        for (var nama : namaKeluarga) {
            System.out.println(nama);
        }

        System.out.println();

        // membuat LinkedHashSet.
        Set<String> namaKeluarga2 = new LinkedHashSet<>();

        // menambahan data.
        namaKeluarga2.add("paijo");
        namaKeluarga2.add("subana");
        namaKeluarga2.add("panji");
        namaKeluarga2.add("tika");
        namaKeluarga2.add("rumlah");
        namaKeluarga2.add("rumlah"); // data tidak akan duplikat.
        namaKeluarga2.add("rumlah"); // data tidak akan duplikat.

        for (var nama : namaKeluarga2) {
            System.out.println(nama);
        }

        System.out.println();

        // membuat enumset.
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);

        for (var gender : genders){
            System.out.println(gender.name());
        }

    }
}
