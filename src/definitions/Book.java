/*  Created by IntelliJ IDEA.
 *  User: Himanshu Gupta (191500345)
 *  Date: 26/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */

package definitions;

public class Book {

    //Components of a definition class in Java.
    // 1. private fields.
    // 2. getter methods for private fields.
    // 3. setter methods for private fields.
    // 4. Constructors for initializing the fields of an object.
    // 5. the toString() method.
    // 6. the equals() and the hashCode() methods.

    private String bookName;
    private String authorName;
    private String thirteenDigitIsbnNumber;

    //1. The getter method : it is used to read the value of a private field.
    // Observer methods / Accessor Methods

    /**
     * This method returns the name of the book.
     *
     * @return The name of the book.
     */

    public String getBookName() {
        return bookName;
    }

    //2. The setter method : used to write the value of a private field.
    // Transformer methods / Mutator Methods

    /**
     * This method will change the book name
     *
     * @param bookName The name of the book that you want to given
     */

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * This method returns the name of the author of the book.
     *
     * @return The name of author of the book.
     */

    public String getAuthorName() {
        return authorName;
    }


}
