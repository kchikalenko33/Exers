package netology.task4_5_1;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Call {
    private final Map<String, Contact> contacts = new HashMap<>();
    private final Map<LocalDateTime, String> missedCalls = new TreeMap<>();

    public void addContact(Contact contact) {
        contacts.put(contact.getPhone(), contact);
    }

    public Contact findContact(String firstName, String lastName) {

        for ( Contact contact : contacts.values()) {
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                return contact;
            }
        }

        throw new RuntimeException();
    }

    public Contact findContact(String phone) {
        return contacts.get(phone);
    }

    public void removeContact(String firstName, String lastName) {
        Iterator<Contact> iterator = contacts.values().iterator();

        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                iterator.remove();
                return;
            }
        }
        throw new RuntimeException("Контакт не найден для удаления: " + firstName + " " + lastName); // todo создать собственное
    }

    public void addMissedCall(String phone) {
        missedCalls.put(LocalDateTime.now(), phone);
    }

    public void infoMissedCalls() {
        System.out.println("Список пропущенных вызовов: ");
        for (Map.Entry<LocalDateTime, String> entry : missedCalls.entrySet()) {
            System.out.println(entry);
        }
    }

    public void clearMissedCalls() {
        missedCalls.clear();
    }
}
