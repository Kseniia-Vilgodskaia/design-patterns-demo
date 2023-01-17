package org.example.patterns.composite;

public class CompositeDemoApp {
    public static void main(String[] args) {
        //create test books
        Book adventureBook = new AdventureBook("Patrick's incredible adventures");
        Book historicBook = new HistoricBook("History of Quidditch");
        Book scienceBook = new ScienceBook("Not lame science");

        //create first composite
        Archive archive1 = new Archive("Main Archive");
        //add books
        archive1.addBook(adventureBook);
        archive1.addBook(historicBook);

        //create second composite
        Archive archive2 = new Archive("Additional Archive");
        archive2.addBook(scienceBook);

        //add additional archive to the main one
        archive1.addBook(archive2);
        archive1.printName();
    }
}
