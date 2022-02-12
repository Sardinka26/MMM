package Encapsulation_04.Immutable_03;

public class Book {
    private final String name;
    private final String nameAuthorBook;
    private final int countPageBook;
    private  final int numberISBN;

    public Book(String name, String nameAuthorBook, int countPageBook, int numberISBN) {
        this.name = name;
        this.nameAuthorBook = nameAuthorBook;
        this.countPageBook = countPageBook;
        this.numberISBN = numberISBN;
    }

    public String getName() {
        return name;
    }

    public String getNameAuthorBook() {
        return nameAuthorBook;
    }

    public int getCountPageBook() {
        return countPageBook;
    }

    public int getNumberISBN() {
        return numberISBN;
    }
}
