package com.dragan.asdc.util;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyFileReader {
    private String file;

    public MyFileReader(String file) {
        this.file = file;
    }

    public List<Person> read() {
        List<Person> persons = new ArrayList<Person>();
        try {
            String url = this.getClass().getResource("../../../../"+file).getPath();
            File readFile = new File(url);
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(readFile));
            JSONArray jsonArray = (JSONArray) obj;
            Iterator<JSONObject> iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject line = iterator.next();
                boolean isMale =  ((String) line.get("gender")).equals("Male")? true:false;
                Person person = new Person( (long) line.get("id"), (String) line.get("first_name"), (String)line.get("last_name"),(String) line.get("email"), isMale );
                persons.add(person);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return persons;
    }
}
