package practical_task.file13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        contacts.put(contact.getPhone(), contact);
    }

    public List<Contact> getContacts() { // реализовать через одну строку
        List<Contact> contacts = new ArrayList<>();
        for (Contact contact : this.contacts.values()) {
            contacts.add(contact);
        }

        return contacts;
    }
}
