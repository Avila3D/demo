import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void print() {
        Contact contact = new Contact("Craig Smith");
        Contact contact2 = new Contact("Antonio Avila");
//        contact.setName("Craig Smith");
        contact.setPhone("801-555-1234");
        contact.setAge(46);
        contact.setAddress("123 Anywhere Street Sandy UT 84070");
        contact.setEmail("so@q.com");

        assertEquals("Name: Craig Smith  Phone: 801-555-1234  Age: 46  Address: 123 Anywhere Street Sandy UT 84070  Email: so@q.com", contact.print());
        assertEquals("Name: Craig Smith  Phone: 801-555-1234  Email: so@q.com", contact.shortPrint());
    }
}