package Module_10;
import java.util.ArrayList;
import java.util.List;

public class TodoList {

    private List<String> list = new ArrayList<>();

    public void edit(int index, String todo) {
        if (index < list.size()) {
            list.set(index, todo);
        }
    }

    public void add(String todo) {
        list.add(todo);
    }

    public void add(int index, String todo) {
        if (index < list.size()) {
            list.add(index,todo);
        } else add(todo);
    }

    public void delete(int index) {
        if (index < list.size()) {
            list.remove(index);
        }
    }

    public List<String> getTodos() {
        int numberCase = -1;
        for (int i = 0; i < list.size(); i++) {
            numberCase++;
            System.out.println(numberCase + "-" + list.get(i));
        }
        return list;
    }


}