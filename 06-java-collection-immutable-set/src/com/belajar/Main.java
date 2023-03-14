// JAVA IMMUTABLE SET

/*------------------------------------------------------------
*| JAVA IMMUTABLE SET
*|------------------------------------------------------------
*| - Secara default, set di java ArrayList dan LinkedList
*|   bersifat mutable(dapat diubah).
*| - Di java mendukung membuat set yang immutable/tidak dapat
*|   diubah.
*| - Sekali dibuat datanya tidak dapat diubah/final.
*| - Yang tidak dapat diubah adalah isi element.
*| - Digunakan untuk mengkapsulasi data object agar tidak dapat
*|   diubah secara langsung dari luar class.
*|------------------------------------------------------------
*| - METHOD UNTUK MEMBUAT IMMUTABLE SET
*|   - Collections.emptySet()
*|     Untuk membuat immutable set kosong.
*|   - Collections.singleton(e)
*|     untuk membuat immutable set berisi 1 elemen.
*|   - Collections,unmodifiableSet(set)
*|     Untuk mengubah mutable set menjadi immutable.
*|   - Set.of(e)
*|     Untuk membuat immutable set dari elemen elemen.
*|------------------------------------------------------------
*/

package com.belajar;

import java.util.Collections;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("BELAJAR JAVA 06 COLLECTION IMMUTABLE SET");

        //  - Collections.emptySet()
        Set<String> empety = Collections.emptySet();

        //  - Collections.singleton(e)
        Set<String> singleTon = Collections.singleton("papa");

        //  - Collections.unmodifiableSet(list)
        Set<String> namaKeluarga = Set.of("papa","mama","adik");
        Set<String> immutable = Collections.unmodifiableSet(namaKeluarga);
        // immutable.add("koliko"); error

        //  - Set.of(e)
        Set<String> namaKeluarga2 = Set.of("joko","papa","patmawati");
        // namaKeluarga2.add("kolomodo"); error

    }
}
