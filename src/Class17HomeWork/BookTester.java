package Class17HomeWork;

public class BookTester {
    public static void main(String[] args) {

        Book book=new Book("Lord Of The Rings",1954, "Miguel de Cervantes");
        book.printInfo();

        Book book1=new Book();
        book1.printInfo();
    }
}
