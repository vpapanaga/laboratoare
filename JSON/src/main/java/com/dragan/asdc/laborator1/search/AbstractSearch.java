package com.dragan.asdc.laborator1.search;

import com.dragan.asdc.util.Person;

import java.util.List;

public abstract class AbstractSearch {

    private List<Person> searchDump;

    public AbstractSearch(List<Person> searchDump) {
        this.searchDump = searchDump;
    }

    abstract public List<Person> search(int value);

    public List<Person> getSearchDump() {
        return searchDump;
    }
}
