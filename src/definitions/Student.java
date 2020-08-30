/*  Created by IntelliJ IDEA.
 *  User: Himanshu Gupta (191500345)
 *  Date: 28/08/20
 *  Time: 3:50 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String studentFirstName, studentMiddleName, studentLastName;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] issuedBooksName;

    //add getter and setter methods to read and write the value of private fields respectively

    /**
     * This method returns the first name of the student.
     *
     * @return The first name of the student.
     */

    public String getStudentFirstName() {
        return studentFirstName;
    }

    /**
     * This method sets the first name of student.
     *
     * @param studentFirstName The first name of the student that you want to set.
     */

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    /**
     * This method returns the middle name of the student.
     *
     * @return The middle name of the student.
     */

    public String getStudentMiddleName() {
        return studentMiddleName;
    }

    /**
     * This method sets the middle name of student.
     *
     * @param studentMiddleName The middle name of the student that you want to set.
     */

    public void setStudentMiddleName(String studentMiddleName) {
        this.studentMiddleName = studentMiddleName;
    }

    /**
     * This method returns the last name of the student.
     *
     * @return The last name of the student.
     */

    public String getStudentLastName() {
        return studentLastName;
    }

    /**
     * This method sets the last name of student.
     *
     * @param studentLastName The last name of the student that you want to set.
     */

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    /**
     * This method returns the university roll number of the student.
     *
     * @return The university roll number of the student.
     */

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    /**
     * This method sets the university roll number of student.
     *
     * @param universityRollNumber The university roll number of the student that you want to set.
     */
    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    /**
     * This method returns the number of books issued by the student.
     *
     * @return The number of books issued by the student.
     */

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    /**
     * This method sets the number of books issued by the student.
     *
     * @param numberOfBooksIssued The number of books issued by the student that you want to given.
     */

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }


    /**
     * This method returns all the name of books issued by the student.
     *
     * @return All the name of books issued by the student.
     */

    public Book[] getIssuedBooksName() {
        return issuedBooksName.clone();
    }

}
