package Module_10;

import java.util.*;

public class PhoneBook {

    Map<String, String> mapContact = new HashMap<>();


    public boolean isNumberContains(String inputNumber) {
        return mapContact.containsKey(inputNumber);
    }

    public boolean isNumberNotContains(String inputNumber) {
        return !mapContact.containsKey(inputNumber);
    }

    public boolean isNameContains(String inputName) {
        return mapContact.containsValue(inputName);
    }

    public boolean isNameNotContains(String inputName) {
        return !mapContact.containsValue(inputName);
    }

    public void addContact(String phone, String name) {
        mapContact.putIfAbsent(phone, name);
        if (mapContact.containsKey(phone)) {
            mapContact.put(phone, name);
        }
    }

    public String getContactByPhone(String phone) {
        System.out.println(mapContact.get(phone) + " " + phone);
        return "";
    }

    public Set<String> getContactByName(String name) {
        Set<Map.Entry<String, String>> entrySet = mapContact.entrySet();
        Set<String> treeSet = new TreeSet<>();
        for (Map.Entry<String, String> objectEntrySet : entrySet) {
            if (name.equals(objectEntrySet.getValue())) {
                treeSet.add(objectEntrySet.getKey());
                System.out.println(name + " " + treeSet.toString().replaceAll("^\\[|\\]$", " "));
            } else {
                return new TreeSet<>();
            }
        }

        return treeSet;
    }


    public Set<String> getAllContacts() {
        Set<String> treeSet = new TreeSet<>();
        if (mapContact.isEmpty()) {
            return new TreeSet<>();
        } else {
            for (Map.Entry<String, String> entry : mapContact.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(value + " " + key);
            }
        }
        return treeSet;
    }
}




