public class Printer {
    private String queue = "";
    private String nameDoc;
    private int countPageDoc;
    private String textDoc;
    private int pendingPagesCount = 0;
    private int allPrintDoc = 0;

    public Printer() {
        queue = "Список документов на печать:";
    }

    public int allPendingPagesCount() {
        System.out.println(" Общее колличество распечатанных страниц за всё время :" + allPrintDoc);
        return allPrintDoc;
    }

    public int getPendingPagesCount() {
        return pendingPagesCount;
    }

    public void print() {          // Печатает .....
        if (queue.isEmpty()) {
            System.out.println("Документов на печать нет");
        } else {
            System.out.println(queue);
        }
        System.out.println(" общее количетво добавленнвх на печать СЕЙЧАС " + getPendingPagesCount());
        allPrintDoc += pendingPagesCount;
        clear();
    }

    public void append(String nameDoc, int countPageDoc, String textDoc) {
        queue = queue + "\n" + " Документ / " + nameDoc + "/ " + countPageDoc + " страниц " + " /принят на печать " + "/Текст документа : " + textDoc;
        pendingPagesCount += countPageDoc; // общее количество добавленное на печать, но не распечанно
        ;   // общее количество документов распечатанных за всё время работы приньера
    }

    public void clear() {

        queue = "";
        pendingPagesCount = 0;
        System.out.println(" Очередь печати очищена : ");
    }


    public void append(String nameDoc, String textDoc) {
        queue = queue + "\n" + " Документ / " + nameDoc + " / с текстом " + textDoc + " /принят на печать";
    }

    public void append(String textDoc) {
        queue = queue + "\n" + " Документ с текстом / " + textDoc + " / принят на печать ";
    }


}



