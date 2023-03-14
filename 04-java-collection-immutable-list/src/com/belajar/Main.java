// JAVA IMMUTABLE LIST

/*------------------------------------------------------------
*| JAVA IMMUTABLE LIST
*|------------------------------------------------------------
*| - Secara default, list di java ArrayList dan LinkedList
*|   bersifat mutable(dapat diubah).
*| - Di java mendukung membuat list yang immutable/tidak dapat
*|   diubah.
*| - Sekali dibuat datanya tidak dapat diubah/final.
*| - Yang tidak dapat diubah adalah isi element.
*| - Digunakan untuk mengkapsulasi data object agar tidak dapat
*|   diubah secara langsung dari luar class.
*|------------------------------------------------------------
*| - METHOD UNTUK MEMBUAT IMMUTABLE
*|   - Collections.emptyList()
*|     Untuk membuat immutable list kosong.
*|   - Collections.singletonList(e)
*|     untuk membuat immutable list berisi 1 elemen.
*|   - Collections,unmodifiableList(list)
*|     Untuk mengubah mutable list menjadi immutable.
*|   - List.of(e)
*|     Untuk membuat immutable list dari elemen elemen.
*|------------------------------------------------------------
*/

package com.belajar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("BELAJAR JAVA 04 COLLECTION IMMUTABLE LIST");

        //  - Collections.emptyList()
        List<String> empety = Collections.emptyList();

        //  - Collections.singletonList(e)
        List<String> singleTon = Collections.singletonList("papa");

        //  - Collections.unmodifiableList(list)
        List<String> namaKeluarga = new ArrayList(List.of("papa","mama","adik"));
        List<String> immutable = Collections.unmodifiableList(namaKeluarga);
        // immutable.add("koliko"); error

        //  - List.of(e)
        List<String> namaKeluarga2 = List.of("joko","papa","patmawati");
        // namaKeluarga2.add("kolomodo"); error

    }
}
