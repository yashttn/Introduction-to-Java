package Java2.Ques1;

import java.util.Scanner;

public class Librarian implements Library {
    String name;
    int id;
    static int bookscount=0;

    @Override
    public void issueBooks() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Book Name : ");
        name = sc.next();
        System.out.println("Enter Book Id : ");
        id = sc.nextInt();
        bookscount++;
        System.out.println("Total Books Issued: " + bookscount);
    }

    @Override
    public void returnBooks() {
        System.out.println("books returned successfully");
        bookscount--;
        System.out.println("Total Books Issued: " + bookscount);
    }

    @Override
    public void showBooks() {
        System.out.println("Issued Book Name: " + name);
        System.out.println("Issued Book Id: " + id);
    }
}