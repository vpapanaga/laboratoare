package com.dragan.asdc.laborator1.search;

import com.dragan.asdc.util.Person;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch extends AbstractSearch{
    public BinarySearch(List<Person> searchDump) {
        super(searchDump);
    }

    public static int cautareBinarăRecursiv(int[] tablou, int stanga, int dreapta, int elementCautat) {
        if (dreapta >= stanga) {
            int mijloc = stanga + (dreapta - stanga) / 2;

            // Dacă elementul este la mijloc
            if (tablou[mijloc] == elementCautat) {
                return mijloc;
            }

            // Dacă elementul este mai mic decât mijlocul, căutăm în partea stângă a tabloului
            if (tablou[mijloc] > elementCautat) {
                return cautareBinarăRecursiv(tablou, stanga, mijloc - 1, elementCautat);
            }

            // Altfel, căutăm în partea dreaptă a tabloului
            return cautareBinarăRecursiv(tablou, mijloc + 1, dreapta, elementCautat);
        }

        // Dacă elementul nu este prezent în tablou
        return -1;
    }

    public Person cautareBinarăRecursiv(Person[] tablou, int stanga, int dreapta, int elementCautat) {
        if (dreapta >= stanga) {
            int mijloc = stanga + (dreapta - stanga) / 2;

            // Dacă elementul este la mijloc
            if (tablou[mijloc].getId() == elementCautat) {
                return tablou[mijloc];
            }

            // Dacă elementul este mai mic decât mijlocul, căutăm în partea stângă a tabloului
            if (tablou[mijloc].getId() > elementCautat) {
                return cautareBinarăRecursiv(tablou, stanga, mijloc - 1, elementCautat);
            }

            // Altfel, căutăm în partea dreaptă a tabloului
            return cautareBinarăRecursiv(tablou, mijloc + 1, dreapta, elementCautat);
        }

        // Dacă elementul nu este prezent în tablou
        return null;
    }


    @Override
    public List<Person> search(int value) {
        Person[] persons = getSearchDump().toArray(new Person[0]);
        List<Person> result = new ArrayList<Person>();
        int lungime = persons.length;
        // Apelăm metoda de căutare binară
        Person find = cautareBinarăRecursiv(persons, 0, lungime - 1, value);
        if (find!=null) {
            result.add(find);
        }
        return result;
    }
}
