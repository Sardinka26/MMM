package Module_10;

import java.util.*;

public class PhoneBook {

    private static Map<String, String> mapContact = new HashMap<>();

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
        String str = "";
        if (mapContact.containsKey(phone)) {
            str = mapContact.get(phone) + " - " + phone;
            System.out.println(str);
            return str;
        } else {
            return "";
        }
    }

    public Set<String> getContactByName(String name) {
        Set<Map.Entry<String, String>> entrySet = mapContact.entrySet();
        Set<String> treeSet = new TreeSet<>();
        String value = "";

        for (Map.Entry<String, String> objectEntrySet : entrySet) {
            if (name.equals(objectEntrySet.getValue())) {
                value = objectEntrySet.getValue() + " - " + objectEntrySet.getKey();
                treeSet.add(value);
            }
        }  System.out.println(treeSet.toString().replaceAll("^\\[|\\]$", " "));

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
                System.out.println(value + " - " + key);
            }
        }
        return treeSet;
    }
}




