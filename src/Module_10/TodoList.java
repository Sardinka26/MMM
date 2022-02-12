package Module_10;

import java.util.ArrayList;

public class TodoList {
    public ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> getList() {
        return list;

    } public void edit(int index, String todo) {
        list.set(index,todo);
    }

    public void add(String todo) {
        list.add(todo);
    }

    public void add(int index, String todo) {
        list.add(index, todo);
    }

    public void delete(int index) {
        list.remove(index);

    }

    public ArrayList<String> getTodos() {
        int numberCase = -1;
        for (int i = 0; i < list.size(); i++) {
            numberCase++;
            System.out.println(numberCase + "-" + list.get(i));
        }
        return new ArrayList<>();
    }
}

