package com.dragan.asdc.laborator1;

import com.dragan.asdc.laborator1.search.BinarySearch;
import com.dragan.asdc.laborator1.search.SecventialSearch;
import com.dragan.asdc.util.MyFileReader;
import com.dragan.asdc.util.Person;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyFileReader myFileReader = new MyFileReader("data.json");
        List<Person> persons = myFileReader.read();
        // Exemplu de Secvential Search
        SecventialSearch secventialSearch = new SecventialSearch(persons);
        SecventialSearchExample(secventialSearch);

        // Exemplu de Binary Search
        BinarySearch binarySearch = new BinarySearch(persons);
        BinarySearchExample(binarySearch);
    }

    private static void BinarySearchExample(BinarySearch sse) {
        // Search by ID
        System.out.println("Search by ID = 29");
        for (Person p: sse.search(29)) {
            System.out.println(p);
        }
    }

    private static void SecventialSearchExample(SecventialSearch sse) {
        // Search by ID
        System.out.println("Search by ID = 5");
        for (Person p: sse.searchById(5)) {
            System.out.println(p);
        }

        // Search by First Name
        System.out.println("\nSearch by First Name = Maximilien");
        for (Person p: sse.searchByFirstName("Maximilien")) {
            System.out.println(p);
        }

        // Search by Last Name
        System.out.println("\nSearch by Last Name = Pelcheur");
        for (Person p: sse.searchByLastName("Pelcheur")) {
            System.out.println(p);
        }

        // Search by Email
        System.out.println("\nSearch by Email = tdibartolomeo13@technorati.com");
        for (Person p: sse.searchByEmail("tdibartolomeo13@technorati.com")) {
            System.out.println(p);
        }

        // Search by Gender
        System.out.println("\nSearch by Male");
        for (Person p: sse.searchByMale(true)) {
            System.out.println(p);
        }
    }
}
