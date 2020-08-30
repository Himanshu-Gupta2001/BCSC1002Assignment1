/* Created by IntelliJ IDEA.
 *  Author: Himanshu Gupta (191500345)
 *  Date: 27/8/2020
 *  Time: 11:37 PM
 *  File Name: Library.java
 */

package definitions;

public class Library {

    private Book[] availableBooks;

    public Library() {
        this.availableBooks = new Book[10];
        for (int index = 0; index < availableBooks.length; index++) {
            availableBooks[index] = new Book(" Available Book" + (index + 1), " Author Name" + (index + 1), " 978-0-76-115-728" + (index));
        }
    }


    public Book[] getAvailableBooks() {
        return availableBooks.clone();
    }

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }




}
