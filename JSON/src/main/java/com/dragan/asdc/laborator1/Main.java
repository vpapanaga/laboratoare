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
        System.out.println("\nSearch by First Name = Bastian");
        for (Person p: searcher.searchByFirstName("Bastian")) {
            System.out.println(p);
        }

        // Search by Last Name
        System.out.println("\nSearch by Last Name = Pelerin");
        for (Person p: searcher.searchByLastName("Pelerin")) {
            System.out.println(p);
        }

        // Search by Email
        System.out.println("\nSearch by Email = lmcnicklee@1688.com");
        for (Person p: searcher.searchByEmail("lmcnicklee@1688.com")) {
            System.out.println(p);
        }

    }
}