package model;

import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import static org.junit.Assert.*;
import java.io.File;
import java.io.FileReader;

public class PersonTest {
    // String json = "{\"name\":\"John Doe\",\"age\":30,\"address\":\"123 Main St\",\"contact\":{\"email\":\"john.doe@example.com\",\"phone\":\"555-1234\"}}";

    JsonReader getJson() throws Exception{
        JsonReader reader = new JsonReader(new FileReader("resources/test.json"));
        return reader; 
    }
    @Test
    void testAddress() {

    }

    @Test
    void testAge() {

    }

    @Test
    void testContact() {
        try{
            Person person = new Gson().fromJson(getJson(), Person.class);
            Contact contact = person.contact();
            assertNotNull(contact);
            assertEquals("john.doe@example.com", contact.email());
            assertEquals("555-1234", contact.phone());
        }
        catch(Exception e){
            
        }
    }

    @Test
    void testEquals() {

    }

    @Test
    void testHashCode() {

    }

    @Test
    void testName() {
        try{
        Person person = new Gson().fromJson(getJson(), Person.class);
        assertEquals("John Doe", person.name());
        }
        catch(Exception e){
            
        }
    }

    @Test
    void testToString() {

    }
}
