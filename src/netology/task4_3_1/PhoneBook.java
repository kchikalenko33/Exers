package netology.task4_3_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Contact>> groups = new HashMap<>();
    private Map<String, Contact> contacts = new HashMap<>();

    public void createContact(Contact contact) {
        contacts.put(contact.getPhone(), contact);
    }

    public void createGroup(String nameGroup) {
        if (!groups.containsKey(nameGroup)) {
            groups.put(nameGroup, new ArrayList<>());
            System.out.println("Группа '" + nameGroup + "' создана.");
        } else {
            System.out.println("Группа '" + nameGroup + "' уже существует.");
        }
    }

    public void addContactByGroup(Contact contact, String nameGroup) {
        if (groups.containsKey(nameGroup)) {
            groups.get(nameGroup).add(contact);
        } else {
            System.out.println("Группы " + nameGroup + " не существует.");
        }
    }

    public List<Contact> findContactsByGroup(String nameGroup) {
        if (groups.containsKey(nameGroup)) {
            return groups.get(nameGroup);
        } else {
            throw new GroupNotFoundException("Группы " + nameGroup + " не существует");
        }
    }

    public Contact findContactByPhone(String phoneNumber) {
        if (contacts.containsKey(phoneNumber)) {
            return contacts.get(phoneNumber);
        } else {
            throw new ContatcNotFoundException("Контакта " + phoneNumber + " не существует");
        }
    }

}
