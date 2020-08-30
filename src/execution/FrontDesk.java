/* Created by IntelliJ IDEA.
 *  Author: Himanshu Gupta (191500345)
 *  Date: 29/8/2020
 *  Time: 1:02 AM
 *  File: FrontDesk.java
 */
package execution;

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
        studentInput = scannerObject.nextInt();
        scannerObject.nextLine();
        do {
            System.out.println();
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-");
            System.out.println("How may I help you today?");
            System.out.println("1. Issue a new book for me.");
            System.out.println("2. Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books.");
            System.out.println("4. Exit.");
            System.out.println("Enter you choice (1..4):");

        } while (studentInput != EXIT);
        scannerObject.close();

    }
}
