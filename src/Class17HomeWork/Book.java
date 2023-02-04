package Class17HomeWork;

public class Book {

    /*
    Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed
     */

    String name;
    int year;
    String author;

    public Book(String name, int year, String author){ // instance variables initialization
        this.name=name;
        this.year=year;
        this.author=author;
    }


     Book (){ // instance variables initialization
        name="Da Vinci Code";
        author="Dan Brown";
    }

    void printInfo(){
        System.out.println("Book Name: "+name+" Book Year: "+year+" Book Author: "+author);
    }
    }

