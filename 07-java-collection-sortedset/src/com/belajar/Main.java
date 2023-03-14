// JAVA SOPRTEDSET

/*------------------------------------------------------------
*| JAVA SOERTEDSED
*|------------------------------------------------------------
*| - SortedSed adalah turunan dari Set, namun di SortedSed
*|   element element yang dimasukkan akan secara otomatis
*|   diurutkan.
*| - Jika element adalah turunan dari interfce Comparable, maka
*|   secara otomatis akan diurutkan menggunakan comparable
*|   tersebut.
*| - Jika element bkan turunan dari interface Comparable, maka
*|   kita bisa menggunakan Comparator untuk memberi tahu
*|   SortedSed bagaimana cara menggurutkan element element nya.
*|------------------------------------------------------------
*| - METHOD UNTUK MEMBUAT IMMUTABLE SORTEDSET
*|   - Collections.emptySortedSet()
*|     Untuk membuat immutable SoetedSet kosong.
*|   - Collections,unmodifiableSortedSet(set)
*|     Untuk mengubah mutable SortedSet menjadi immutable.
*|------------------------------------------------------------
*/

package com.belajar;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("BELAJAR JAVA 07 COLLECTION SORTEDSET");

        // ini adalah cara membuat sortedsed, harus menggunakan TreeSet<>.
        SortedSet<Person> personSortedSet;
        personSortedSet = new TreeSet<>(new PersonComparator());

        personSortedSet.add(new Person("joko"));
        personSortedSet.add(new Person("papa"));
        personSortedSet.add(new Person("kamu"));
        personSortedSet.add(new Person("dia"));

        for (var nama : personSortedSet){
            System.out.println(nama);
        }

        // membuat immutable sortedsed.

        SortedSet<Person> personSortedSet1 = Collections.unmodifiableSortedSet(personSortedSet);

        // ini akan error karena immutable.
        personSortedSet1.add(new Person("kolimono"));

    }
}
