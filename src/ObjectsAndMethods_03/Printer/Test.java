public class Test {
    public static void main(String[] args) {

        Printer printer = new Printer();
        printer.append(" \"Властелин колец\" ", 250, "\"Доброе утро Хоббиты\" ");
        printer.append(" \"Книга о лягушках\" ", " Ква-Ква ");
        printer.append(" \"Как разобрать машину\" ");
        printer.append(" \"Как попасть на Сатурн\" ", 300, " \"Пристегните ремни, взлетаем\"");
        printer.print();
        printer.allPendingPagesCount();
        printer.getPendingPagesCount();
        printer.append(" \"Властелин колец\" ", 100, "\"Доброе утро Хоббиты\" ");
        printer.append(" \"Книга о лягушках\" ", " Ква-Ква ");
        printer.append(" \"Как разобрать машину\" ");
        printer.append(" \"Как попасть на Сатурн\" ", 500, " \"Пристегните ремни, взлетаем\"");
        printer.print();
        printer.getPendingPagesCount();
        printer.allPendingPagesCount();



    }
}
