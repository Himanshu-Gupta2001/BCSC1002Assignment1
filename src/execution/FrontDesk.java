/* Created by IntelliJ IDEA.
 *  Author: Himanshu Gupta (191500345)
 *  Date: 29/8/2020
 *  Time: 1:02 AM
 *  File: FrontDesk.java
 */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_A_NEW_BOOK_FOR_ME = 1;
    private static final int RETURN_A_PREVIOUSLY_ISSUED_BOOK_FOR_ME = 2;
    private static final int SHOW_ME_ALL_MY_ISSUES_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int studentInput;
        String nameOfBook;
        String fullName;
        long rollNumber;
        Book bookObject = new Book();
        Student studentObject = new Student();
        Library libraryObject = new Library();
        do {
            System.out.println();
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter you choice (1..4):");
            studentInput = scannerObject.nextInt();
            scannerObject.nextLine();
            switch (studentInput) {
                case ISSUE_A_NEW_BOOK_FOR_ME:
                    System.out.println("Please enter your full name : ");
                    fullName = scannerObject.nextLine();
                    System.out.println("Please enter your University Roll Number : ");
                    rollNumber = scannerObject.nextLong();
                    for (Book book : libraryObject.getAvailableBooks()) {
                        System.out.println(book);
                    }
                    System.out.println("Please select any one book out of these books");
                    scannerObject.nextLine();
                    nameOfBook = scannerObject.nextLine();
                    studentObject.issueBookForMe(fullName, rollNumber, nameOfBook);
                    break;
                case RETURN_A_PREVIOUSLY_ISSUED_BOOK_FOR_ME:
                    System.out.println("Please enter your full name : ");
                    fullName = scannerObject.nextLine();
                    System.out.println("Please enter your University Roll Number : ");
                    rollNumber = scannerObject.nextLong();
                    System.out.println("Please enter a book name do you want to Return : ");
                    scannerObject.nextLine();
                    nameOfBook = scannerObject.nextLine();
                    studentObject.returnIssuedBook(nameOfBook, fullName, rollNumber);
                    break;
                case SHOW_ME_ALL_MY_ISSUES_BOOKS:
                    System.out.println("Please enter your First name : ");
                    fullName = scannerObject.nextLine();
                    System.out.println("Please enter your University Roll Number : ");
                    rollNumber = scannerObject.nextLong();
                    System.out.println("All issues books of " + fullName + " having university roll number " + rollNumber + " are as follows :");
                    studentObject.showAllIssuedBooks();
                    break;
            }
        } while (studentInput != EXIT);
        scannerObject.close();
    }
}