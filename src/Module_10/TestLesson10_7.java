package Module_10;

import java.util.Scanner;

public class TestLesson10_7 {
    private static TodoList todoList = new TodoList();
    private static Scanner scanner = new Scanner(System.in);
    private static final String LIST = "LIST";
    private static final String ADD = "ADD\\s\\D.+";
    private static final String ADD_WITH_INDEX = "ADD\\s\\d+.+";
    private static final String EDIT = "EDIT\\s\\d+\\s.+";
    private static final String DELETE = "DELETE\\s\\d+";
    private static final String STOP = "STOP";

    public static void main(String[] args) {
        todoList.add("Покормить собаку");
        todoList.add("Покормить рыбок");
        todoList.add("Купить яблоко");
        todoList.add("Сходить в магазин");

        while (true) {
            String input = scanner.nextLine();

            if (input.matches(EDIT)) {
                String[] indexAndText = getIndexAndText(input, "EDIT");
                int indexNumber = Integer.parseInt(indexAndText[0]);
                System.out.println("Дело " + todoList.getTodos().get(indexNumber) + " заменено на " + "\"" + indexAndText[1] + "\"");
                todoList.edit(indexNumber, indexAndText[1]);
            }

            if (input.equals(LIST)) {
                todoList.getTodos();
            }

            if (input.matches(ADD)) {
                String goodText = input.replaceFirst("ADD", "").trim();
                todoList.add(goodText);
                System.out.println("Добавлено дело" + " " + "\"" + goodText + "\"");
            }

            if (input.matches(ADD_WITH_INDEX)) {
                String[] indexAndText = getIndexAndText(input, "ADD");
                int indexNumber = Integer.parseInt(indexAndText[0]);
                todoList.add(indexNumber, indexAndText[1]);
                System.out.println("Добавлено дело" + " " + "\"" + indexAndText[1] + "\"");
            }

            if (input.contains(STOP)) {
                break;
            }

            if (input.matches(DELETE)) {
                String textInput = input.substring(input.lastIndexOf(" ") + 1);
                int processedIndex = Integer.parseInt(textInput);
                if (processedIndex < todoList.getTodos().size()) {
                    System.out.println("Дело " + "\"" + todoList.getTodos().get(processedIndex) + "\"" + " удалено");
                    todoList.delete(processedIndex);
                } else {
                    System.out.println("Дело с таким номером не существует");
                }
            }
        }
    }

    private static String[] getIndexAndText(String input, String command) {
        String inputWithoutAdd = input.replaceFirst(command, "").trim();
        String index = inputWithoutAdd.substring(0, inputWithoutAdd.indexOf(" "));
        String task = inputWithoutAdd.replaceFirst(index, "").trim();
        return new String[]{index, task};
    }
}