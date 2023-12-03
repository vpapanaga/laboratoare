package com.dragan.asdc.laborator1;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyFileReader myFileReader = new MyFileReader("data.json");
        List<Person> persons = myFileReader.read();
        SearchEngine searcher = new SearchEngine(persons);

        // Search by ID
        System.out.println("Search by ID = 5");
        for (Person p: searcher.searchById(5)) {
            System.out.println(p);
        }

        // Search by First Name
        System.out.println("\nSearch by First Name = Maximilien");
        for (Person p: searcher.searchByFirstName("Maximilien")) {
            System.out.println(p);
        }

        // Search by Last Name
        System.out.println("\nSearch by Last Name = Pelcheur");
        for (Person p: searcher.searchByLastName("Pelcheur")) {
            System.out.println(p);
        }

        // Search by Email
        System.out.println("\nSearch by Email = tdibartolomeo13@technorati.com");
        for (Person p: searcher.searchByEmail("tdibartolomeo13@technorati.com")) {
            System.out.println(p);
        }

        // Search by Gender
        System.out.println("\nSearch by Male");
        for (Person p: searcher.searchByMale(true)) {
            System.out.println(p);
        }

    }
}
