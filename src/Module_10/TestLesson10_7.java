package Module_10;

import java.util.Scanner;

public class TestLesson10_7 {

    private static TodoList todoList = new TodoList();
    private static Scanner scanner = new Scanner(System.in);

    public static TodoList getTodoList() {
        return todoList;
    }

    public static void main(String[] args) {

        String action1 = "LIST";
        String action2 = "ADD\\s\\D.+";
        String action3 = "ADD\\s\\d+.+";
        String action4 = "EDIT\\s\\d+\\s.+";
        String action5 = "DELETE\\s\\d+";

        todoList.add("Покормить собаку");
        todoList.add("Покормить рыбок");
        todoList.add("Купить яблоко");
        todoList.add("Сходить в магазин");

        while (true) {
            String input = scanner.nextLine();

            if (input.matches(action4)) {
                String inputWithoutAdd = input.replaceFirst("EDIT", "").trim();
                String index = inputWithoutAdd.substring(0, inputWithoutAdd.indexOf(" "));
                String task = inputWithoutAdd.replaceFirst(index, "").trim();
                int indexNumber = Integer.parseInt(index);
                System.out.println("Дело " + todoList.getList().get(indexNumber) + " заменено на " + "\"" + task + "\"");
                todoList.edit(indexNumber, task);
            }

            if (input.equals(action1)) {
                todoList.getTodos();
            }

            if (input.matches(action2)) {
                String goodText = input.replaceFirst("ADD", "").trim();
                todoList.add(goodText);
                System.out.println("Добавлено дело" + " " + "\"" + goodText + "\"");
            }
            if (input.matches(action3)) {
                String inputWithoutAdd = input.replaceFirst("ADD", "").trim();
                String index = inputWithoutAdd.substring(0, inputWithoutAdd.indexOf(" "));
                String task = inputWithoutAdd.replaceFirst(index, "").trim();
                int indexNumber = Integer.parseInt(index);

                if (indexNumber > todoList.getList().size()) {
                    todoList.add(task);
                    break;
                }
                todoList.add(Integer.parseInt(index), task);
                System.out.println("Добавлено дело" + " " + "\"" + task + "\"");

            }
            if (input.contains("СТОП")) {
                break;
            }
            if (input.matches(action5)) {
                String textInput = input.substring(input.lastIndexOf(" ") + 1);
                int processedIndex = Integer.parseInt(textInput);


                if (processedIndex < todoList.getList().size()) {
                    System.out.println("Дело " + "\"" + todoList.getList().get(processedIndex) + "\"" + " удалено");
                    todoList.delete(processedIndex);

                } else {
                    System.out.println("Дело с таким номером не существует");
                }
            }
        }
    }
}




