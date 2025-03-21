package SingletonPattern;

import DecoratorPattern.Borrowing;
import DecoratorPattern.ExtendedBorrowing;
import FactoryMethodPattern.Book;
import FactoryMethodPattern.BookFactory;
import ObserverPattern.User;
import StrategyPattern.BookSearcher;
import StrategyPattern.SearchByGenre;
import StrategyPattern.SearchByTitle;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = Library.getInstance();
        User user1 = new User("Bao");

        library.registerObserver(user1);

        Book book1 = BookFactory.createBook("physical", "One piece", "Nguyen Thai Bao", "Anime");
        Book book2 = BookFactory.createBook("ebook", "Conan", "Thai Bao", "Anime");
        Book book3 = BookFactory.createBook("audiobook", "Naruto", "Nguyen Bao", "Manga");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("================");

        BookSearcher searcher = new BookSearcher(new SearchByTitle());
        BookSearcher searcher1 = new BookSearcher(new SearchByGenre());

        System.out.println("Search Result: ");
        for (Book book : searcher.search(library.getBooks(),"One piece")) {

            System.out.println(book.getTitle());
        }
        System.out.println("================");

        Borrowing borrowing = new Borrowing(book1);
        Borrowing borrowing2 = new Borrowing(book2);
        Borrowing borrowing3 = new Borrowing(book3);


        ExtendedBorrowing extendedBorrowing = new ExtendedBorrowing(borrowing);
        ExtendedBorrowing extendedBorrowing2 = new ExtendedBorrowing(borrowing2);
        ExtendedBorrowing extendedBorrowing3 = new ExtendedBorrowing(borrowing3);
        System.out.println("Borrowing Result:");
        System.out.println(extendedBorrowing.getDetails());
        System.out.println(extendedBorrowing2.getDetails());
        System.out.println(extendedBorrowing3.getDetails());
    }
}
