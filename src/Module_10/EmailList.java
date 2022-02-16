package Module_10;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EmailList {
    private final String ADD = "(?i:([a-z0-9]+)@([a-z0-9]+)\\.(ru|com))";
    private TreeSet<String> set = new TreeSet<>();

    public void add(String inputText) {
        String text = inputText.replaceFirst("ADD", "").trim().toLowerCase();
        if (text.matches(ADD)) {
            set.add(text);
        } else {
            System.out.println(TestEmailList.WRONG_EMAIL_ANSWER);
        }
    }


    public List<String> getSortedEmails() {
        List<String> list = new ArrayList<>(set);
        for (String str : list) {
            System.out.println(str);
        }
        return list;
    }

}

