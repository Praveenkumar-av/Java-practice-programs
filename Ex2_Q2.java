// Modeling a Library
// Design a class Book with attributes like title, author, and ISBN. Create a class Library that can
// store multiple books. Implement methods to add books, remove books, and display all books in
// the library.

import java.util.Scanner;
class Book
{
    String title, author;
    int isbn;

    void addBooks(String title,String author,int isbn)
    {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static int removeBooks(Book b[],int n,String name)
    {
        int i;
        boolean status = false;
        for(i=0;i<n;i++)
        {
            if(name.equals(b[i].title))
            {
                b[i].title = b[n-1].title;
                b[i].author = b[n-1].author;
                b[i].isbn = b[n-1].isbn;

                b[n-1].title = null;
                b[n-1].author = null;
                b[n-1].isbn = 0;
                status = true;
            }
        }
        if(status)
        {
            System.out.println("Book removed");
            return --n;
        }
        else
        {
            System.out.println("Book not found");
            return n;
        }
    }

    static void display(Book b[],int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.println((i+1)+". "+b[i].title);
        }
    }
}

class Ex2_Q2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int n;

        Book b[] = new Book[20];  // create array of objects

        // predefined books
        b[0] = new Book();
        b[0].addBooks("Java","Rao",12001);
        b[1] = new Book();
        b[1].addBooks("Python","Schildt",12002);
        b[2] = new Book();
        b[2].addBooks("Dreams","Robert",12003);

        n = 3;  // no. of books
        Book.display(b,n);  // display books

        String title, author;
        int isbn, choice = 1;

        while(choice != 0)
        {
            System.out.println("Enter the choice 1 to add book, 2 to remove book, 3 to display books, 0 to exit:");
            choice = scan.nextInt();
            switch(choice)
            {
                case 1:  // add book
                    scan.nextLine();
                    System.out.println("Enter the title of the Book ");
                    title = scan.nextLine();
                    System.out.println("Enter the author of the Book ");
                    author = scan.nextLine();
                    System.out.println("Enter the ISBN of the Book ");
                    isbn = scan.nextInt();
                    b[n] = new Book();
                    b[n].addBooks(title,author,isbn);
                    n++;
                    Book.display(b,n);
                    break;
                
                case 2:  // remove book
                    scan.nextLine();
                    System.out.println("Enter the book to remove :");
                    title = scan.nextLine();
                    n = Book.removeBooks(b,n,title);
                    Book.display(b,n);
                    break;
                
                case 3:  // display
                    Book.display(b,n);
                    break;

                default :
                    if(choice != 0)
                        System.out.println("Invalid");
            }
        }
    }
}