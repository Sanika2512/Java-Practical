import LibraryManagement.Book;
import LibraryManagement.Member;

import java.util.ArrayList;

public class LibrarySystem {
    public static void main(String[] args) {
        // Creating books
        Book book1 = new Book("1984", "George Orwell", "123-ABC");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "456-DEF");

        // Creating members
        Member member1 = new Member("Alice", "M001", "alice@example.com");
        Member member2 = new Member("Bob", "M002", "bob@example.com");

        // Storing in lists
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        ArrayList<Member> members = new ArrayList<>();
        members.add(member1);
        members.add(member2);

        // Displaying info
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("\nLibrary Members:");
        for (Member member : members) {
            System.out.println(member);
        }
    }
}
