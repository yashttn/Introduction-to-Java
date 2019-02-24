package Java2.Ques1;

import java.util.Scanner;

class Ques1 {
    public static void main(String args[]) {
        Librarian librarian = new Librarian();
        do {
            System.out.println("MENU");
            System.out.println("1.Issue books");
            System.out.println("2.Return books");
            System.out.println("3.Show book details");
            System.out.println("4.Exit");
            System.out.println("Enter choice: ");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    librarian.issueBooks();
                    break;
                case 2:
                    librarian.returnBooks();
                    break;
                case 3:
                    librarian.showBooks();
                    break;
            }
        } while (true);
    }


}