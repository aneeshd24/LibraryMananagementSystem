
package librarymanagementsystem;

public class Return 
{
    String book_id, student_id, book_name, student_name, course, branch, dateOfIssue, dateOfReturn;

    public Return(String book_id, String student_id, String book_name, String student_name, String course, String branch, String dateOfIssue, String dateOfReturn) {
        this.book_id = book_id;
        this.student_id = student_id;
        this.book_name = book_name;
        this.student_name = student_name;
        this.course = course;
        this.branch = branch;
        this.dateOfIssue = dateOfIssue;
        this.dateOfReturn = dateOfReturn;
    }

    public String getBook_id() {
        return book_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getStudent_name() {
        return student_name;
    }

    public String getCourse() {
        return course;
    }

    public String getBranch() {
        return branch;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public String getDateOfReturn() {
        return dateOfReturn;
    }
    
}
