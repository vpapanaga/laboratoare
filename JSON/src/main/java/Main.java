import com.dragan.asdc.laborator1.MyFileReader;
import com.dragan.asdc.laborator1.Person;

import java.util.List;

public class Main {

    public static void main(String[] args) {


        MyFileReader myFileReader = new MyFileReader("data.json");
        List<Person> persons = myFileReader.read();
        for (Person person: persons) {
            System.out.println("person.getId() = " + person.getId());
        }

    }
}
