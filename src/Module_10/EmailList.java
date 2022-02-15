package Module_10;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EmailList {

    private TreeSet<String> set = new TreeSet<>();

    public void add(String email) {
        set.add(email);
    }

    public List<String> getSortedEmails() {
         List<String> list = new ArrayList<>(set);
         for(String str : list){
             System.out.println(str);
         }
        return  list;
    }

}

