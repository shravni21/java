/** @author Shravni Wakde
 * @version 3.0
 * @since 2024
 **/

package Annotations_and_Java_doc;

/**
 * @author Shravni Wakde
 * 
 *         Class for Library book
 */
public class Book {
    /**
     * Value is 10 default value
     */
    static int val = 10;

    /**
     * 
     * @param name Book name
     */
    public Book(String name) {

    }

    /**
     * Issue a book to a student
     * 
     * @param roll_no roll number os a student
     * @throws Exception this book is unavailable throws exception
     */

    public void issue(int roll_no) throws Exception {

    }

    /**
     * Check if book is available
     * 
     * @param name Book name
     * @return If book is available returns true else returns false
     */

    public boolean available(String name) {
        return true;
    }

    /**
     * Get book name
     * 
     * @param id book id
     * @return returns the name of the book
     */
    public String getname(int id) {
        return "";
    }
}
