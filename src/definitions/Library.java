/* Created by IntelliJ IDEA.
 *  Author: Himanshu Gupta (191500345)
 *  Date: 27/8/2020
 *  Time: 11:37 PM
 *  File Name: Library.java
 */
package definitions;

import java.util.Arrays;

public class Library {

    private Book[] availableBooks;

    public Library() {
        this.availableBooks = new Book[10];
        for (int index = 0; index < availableBooks.length; index++) {
            availableBooks[index] = new Book(" Available Book" + (index + 1), " Author Name" + (index + 1), " 978-0-76-115-728" + (index));
        }
    }

    public Library(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    public Book[] getAvailableBooks() {
        return availableBooks.clone();
    }

    public void setAvailableBooks(Book[] availableBooks) {
        this.availableBooks = availableBooks;
    }

    @Override
    public String toString() {
        return "Library{" +
                "availableBooks=" + Arrays.toString(availableBooks) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Library)) return false;
        Library library = (Library) o;
        return Arrays.equals(getAvailableBooks(), library.getAvailableBooks());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getAvailableBooks());
    }
}
