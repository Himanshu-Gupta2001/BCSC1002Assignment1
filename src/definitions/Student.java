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


}
