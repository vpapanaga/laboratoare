package com.dragan.asdc.laborator1;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine {
    private List<Person> searchDump;

    public SearchEngine(List<Person> searchDump) {
        this.searchDump = searchDump;
    }

    public List<Person> searchById(int id) {
        List<Person> result = new ArrayList<Person>();
        int counter=0;
        for (Person p: searchDump) {
            if (p.getId()==id) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Person> searchByFirstName(String firstName) {
        List<Person> result = new ArrayList<Person>();
        for (Person p: searchDump) {
            if (p.getFirstName().equals(firstName)) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Person> searchByLastName(String lastName) {
        List<Person> result = new ArrayList<Person>();
        int counter=0;
        for (Person p: searchDump) {
            if (p.getLastName().equals(lastName)) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Person> searchByEmail(String email) {
        List<Person> result = new ArrayList<Person>();
        int counter=0;
        for (Person p: searchDump) {
            if (p.getEmail().equals(email)) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Person> searchByMale(boolean isMale) {
        List<Person> result = new ArrayList<Person>();
        int counter=0;
        for (Person p: searchDump) {
            if (p.isMale()==isMale) {
                result.add(p);
            }
        }
        return result;
    }

    public List<Person> search(int id, String firstName, String lastName, String email) {
        List<Person> result = new ArrayList<Person>();
        int counter=0;
        for (Person p: searchDump) {
            if (p.getId()==id) {
                if (p.getFirstName().equals(firstName)) {
                    if (p.getLastName().equals(lastName)) {
                        if (p.getEmail().equals(email)) {
                            result.add(p);
                        }
                    }
                }
            }
        }
        return result;
    }
}
